package chapter3.exception.Assignment;

public class LogIn {
        public static void login(String id, String pwd) throws Exception{
            if (!id.equals("admin") || !pwd.equals("1234")) {
                throw new Exception("로그인 실패");
            }
        }
}
