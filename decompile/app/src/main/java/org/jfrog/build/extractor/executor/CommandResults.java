package org.jfrog.build.extractor.executor;

/* loaded from: classes7.dex */
public class CommandResults {
    public String err;
    public int exitValue;
    public String res;

    public boolean isOk() {
        return this.exitValue == 0;
    }

    public String getRes() {
        return this.res;
    }

    public void setRes(String str) {
        this.res = str;
    }

    public String getErr() {
        return this.err;
    }

    public void setErr(String str) {
        this.err = str;
    }

    public int getExitValue() {
        return this.exitValue;
    }

    public void setExitValue(int i) {
        this.exitValue = i;
    }
}
