package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes7.dex */
public interface FailableDoubleConsumer<E extends Throwable> {
    public static final FailableDoubleConsumer NOP = new FailableDoubleConsumer() { // from class: org.apache.commons.lang3.function.FailableDoubleConsumer$$ExternalSyntheticLambda0
        @Override // org.apache.commons.lang3.function.FailableDoubleConsumer
        public final void accept(double d) throws Throwable {
            FailableDoubleConsumer.lambda$static$0(d);
        }
    };

    static /* synthetic */ void lambda$static$0(double d) throws Throwable {
    }

    void accept(double d) throws Throwable;

    static <E extends Throwable> FailableDoubleConsumer<E> nop() {
        return NOP;
    }

    default FailableDoubleConsumer<E> andThen(final FailableDoubleConsumer<E> failableDoubleConsumer) {
        Objects.requireNonNull(failableDoubleConsumer);
        return new FailableDoubleConsumer() { // from class: org.apache.commons.lang3.function.FailableDoubleConsumer$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableDoubleConsumer
            public final void accept(double d) throws Throwable {
                this.f$0.lambda$andThen$1(failableDoubleConsumer, d);
            }
        };
    }

    /* synthetic */ default void lambda$andThen$1(FailableDoubleConsumer failableDoubleConsumer, double d) throws Throwable {
        accept(d);
        failableDoubleConsumer.accept(d);
    }
}
