package com.fasterxml.jackson.core.async;

/* loaded from: classes8.dex */
public interface NonBlockingInputFeeder {
    void endOfInput();

    boolean needMoreInput();
}
