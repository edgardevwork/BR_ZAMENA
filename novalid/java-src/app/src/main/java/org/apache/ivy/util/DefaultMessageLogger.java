package org.apache.ivy.util;

/* loaded from: classes5.dex */
public class DefaultMessageLogger extends AbstractMessageLogger {
    public int level;

    public DefaultMessageLogger(int i) {
        this.level = i;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void log(String str, int i) {
        if (i <= this.level) {
            System.out.println(str);
        }
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void rawlog(String str, int i) {
        log(str, i);
    }

    @Override // org.apache.ivy.util.AbstractMessageLogger
    public void doProgress() {
        System.out.print(".");
    }

    @Override // org.apache.ivy.util.AbstractMessageLogger
    public void doEndProgress(String str) {
        System.out.println(str);
    }

    public int getLevel() {
        return this.level;
    }
}
