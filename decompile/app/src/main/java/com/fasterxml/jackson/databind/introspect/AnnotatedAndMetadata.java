package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.Annotated;

/* loaded from: classes3.dex */
public class AnnotatedAndMetadata<A extends Annotated, M> {
    public final A annotated;
    public final M metadata;

    public AnnotatedAndMetadata(A a2, M m) {
        this.annotated = a2;
        this.metadata = m;
    }

    /* renamed from: of */
    public static <A extends Annotated, M> AnnotatedAndMetadata<A, M> m1033of(A a2, M m) {
        return new AnnotatedAndMetadata<>(a2, m);
    }
}
