package pi.individual;

import java.io.Serializable;

public class Container implements Serializable {
    private int errorCode;
    private String dataMessage;

    public Container() {
    }

    public Container(int errorCode, String dataMessage) {
        this.errorCode = errorCode;
        this.dataMessage = dataMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDataMessage() {
        return dataMessage;
    }
    public void setDataMessage(String dataMessage) {
        this.dataMessage = dataMessage;
    }
}
