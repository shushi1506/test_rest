package demo.core.impletemend;

public class ResponeCreateChuContent {
    private String errorMessage;
    private int errorCode;

    public ResponeCreateChuContent() {
        errorMessage="none";
        errorCode=-1;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
