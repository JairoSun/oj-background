package cn.doodlister.onlinejudge.exception;

public class NotFoundException extends GlobalException {
    public NotFoundException(String message, int code) {
        super(message, code);
    }
}
