public class Response {
    final String answer;

    public Response(final Request request) {
        this.answer = String.format("%d %s", request.getInput(), request.getInput() % 2 == 0 ? " is even" : " is odd");
    }
}
