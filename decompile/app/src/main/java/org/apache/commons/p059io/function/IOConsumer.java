package org.apache.commons.p059io.function;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes6.dex */
public interface IOConsumer<T> {
    public static final IOConsumer<?> NOOP_IO_CONSUMER = new IOConsumer() { // from class: org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda1
        @Override // org.apache.commons.p059io.function.IOConsumer
        public final void accept(Object obj) throws IOException {
            IOConsumer.lambda$static$0(obj);
        }
    };

    static /* synthetic */ void lambda$static$0(Object obj) throws IOException {
    }

    void accept(T t) throws IOException;

    static <T> IOConsumer<T> noop() {
        return (IOConsumer<T>) NOOP_IO_CONSUMER;
    }

    default IOConsumer<T> andThen(final IOConsumer<? super T> iOConsumer) {
        Objects.requireNonNull(iOConsumer, TtmlNode.ANNOTATION_POSITION_AFTER);
        return new IOConsumer() { // from class: org.apache.commons.io.function.IOConsumer$$ExternalSyntheticLambda0
            @Override // org.apache.commons.p059io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                this.f$0.lambda$andThen$1(iOConsumer, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$1(IOConsumer iOConsumer, Object obj) throws IOException {
        accept(obj);
        iOConsumer.accept(obj);
    }
}
