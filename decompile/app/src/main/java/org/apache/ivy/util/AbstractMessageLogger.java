package org.apache.ivy.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class AbstractMessageLogger implements MessageLogger {
    public List<String> problems = new ArrayList();
    public List<String> warns = new ArrayList();
    public List<String> errors = new ArrayList();
    public boolean showProgress = true;

    public abstract void doEndProgress(String str);

    public abstract void doProgress();

    @Override // org.apache.ivy.util.MessageLogger
    public void debug(String str) {
        log(str, 4);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void verbose(String str) {
        log(str, 3);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void deprecated(String str) {
        log("DEPRECATED: " + str, 1);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void info(String str) {
        log(str, 2);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void rawinfo(String str) {
        rawlog(str, 2);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void warn(String str) {
        log("WARN: " + str, 3);
        this.problems.add("WARN:  " + str);
        getWarns().add(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void error(String str) {
        log("ERROR: " + str, 3);
        this.problems.add("\tERROR: " + str);
        getErrors().add(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public List<String> getProblems() {
        return this.problems;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void sumupProblems() {
        MessageLoggerHelper.sumupProblems(this);
        clearProblems();
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void clearProblems() {
        this.problems.clear();
        this.warns.clear();
        this.errors.clear();
    }

    @Override // org.apache.ivy.util.MessageLogger
    public List<String> getErrors() {
        return this.errors;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public List<String> getWarns() {
        return this.warns;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void progress() {
        if (this.showProgress) {
            doProgress();
        }
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void endProgress() {
        endProgress("");
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void endProgress(String str) {
        if (this.showProgress) {
            doEndProgress(str);
        }
    }

    @Override // org.apache.ivy.util.MessageLogger
    public boolean isShowProgress() {
        return this.showProgress;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void setShowProgress(boolean z) {
        this.showProgress = z;
    }
}
