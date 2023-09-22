import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LambdaFunc implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    private static final Logger log = LogManager.getLogger(LambdaFunc.class);

    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {
        final APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        try {
            log.error("input: " + input.getBody());
            final Gson gson = new Gson();
            final Request request = gson.fromJson(input.getBody(), Request.class);
            final Response response = new Response(request);
            final String body = gson.toJson(response);
            responseEvent.setBody(body);
            responseEvent.setStatusCode(200);
            log.error("handleRequest ok " + body);
        } catch (Exception ex) {
            responseEvent.setBody(ex.toString());
            responseEvent.setStatusCode(500);
            log.error(ex.toString());
        }
        return responseEvent;
    }
}
