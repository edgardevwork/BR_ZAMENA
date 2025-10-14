package org.apache.ivy.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes5.dex */
public class MessageLoggerEngine implements MessageLogger {
    public final ThreadLocal<Stack<MessageLogger>> loggerStacks = new ThreadLocal<>();
    public MessageLogger defaultLogger = null;
    public List<String> problems = new ArrayList();
    public List<String> warns = new ArrayList();
    public List<String> errors = new ArrayList();

    public final Stack<MessageLogger> getLoggerStack() {
        Stack<MessageLogger> stack = this.loggerStacks.get();
        if (stack != null) {
            return stack;
        }
        Stack<MessageLogger> stack2 = new Stack<>();
        this.loggerStacks.set(stack2);
        return stack2;
    }

    public void setDefaultLogger(MessageLogger messageLogger) {
        this.defaultLogger = messageLogger;
    }

    public void pushLogger(MessageLogger messageLogger) {
        Checks.checkNotNull(messageLogger, "logger");
        getLoggerStack().push(messageLogger);
    }

    public void popLogger() {
        if (getLoggerStack().isEmpty()) {
            return;
        }
        getLoggerStack().pop();
    }

    public MessageLogger peekLogger() {
        if (getLoggerStack().isEmpty()) {
            return getDefaultLogger();
        }
        return getLoggerStack().peek();
    }

    public final MessageLogger getDefaultLogger() {
        MessageLogger messageLogger = this.defaultLogger;
        return messageLogger == null ? Message.getDefaultLogger() : messageLogger;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void warn(String str) {
        peekLogger().warn(str);
        this.problems.add("WARN:  " + str);
        this.warns.add(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void error(String str) {
        peekLogger().error(str);
        this.problems.add("\tERROR: " + str);
        this.errors.add(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public List<String> getErrors() {
        return this.errors;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public List<String> getProblems() {
        return this.problems;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public List<String> getWarns() {
        return this.warns;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void sumupProblems() {
        MessageLoggerHelper.sumupProblems(this);
        clearProblems();
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void clearProblems() {
        getDefaultLogger().clearProblems();
        Iterator<MessageLogger> it = getLoggerStack().iterator();
        while (it.hasNext()) {
            it.next().clearProblems();
        }
        this.problems.clear();
        this.errors.clear();
        this.warns.clear();
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void setShowProgress(boolean z) {
        getDefaultLogger().setShowProgress(z);
        Iterator<MessageLogger> it = getLoggerStack().iterator();
        while (it.hasNext()) {
            it.next().setShowProgress(z);
        }
    }

    @Override // org.apache.ivy.util.MessageLogger
    public boolean isShowProgress() {
        return getDefaultLogger().isShowProgress();
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void debug(String str) {
        peekLogger().debug(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void deprecated(String str) {
        peekLogger().deprecated(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void endProgress() {
        peekLogger().endProgress();
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void endProgress(String str) {
        peekLogger().endProgress(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void info(String str) {
        peekLogger().info(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void rawinfo(String str) {
        peekLogger().rawinfo(str);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void log(String str, int i) {
        peekLogger().log(str, i);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void progress() {
        peekLogger().progress();
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void rawlog(String str, int i) {
        peekLogger().rawlog(str, i);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void verbose(String str) {
        peekLogger().verbose(str);
    }
}
