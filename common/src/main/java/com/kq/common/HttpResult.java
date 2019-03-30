package com.kq.common;

/**
 * HttpResult
 *
 * @author kq
 * @date 2019-03-30
 */
public class HttpResult<T> {

    private boolean success;
    private T result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HttpResult{");
        sb.append("success=").append(success);
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
