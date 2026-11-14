package in.practice.s_b_practical.DTO;

public class ExceptionResponseDto {
    private String messege;
    private String path;

    public ExceptionResponseDto(String messege, String path) {
        this.messege = messege;
        this.path = path;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
