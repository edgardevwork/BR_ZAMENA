package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class Escaper {
    public final Function<String, String> asFunction = new Function() { // from class: com.google.common.escape.Escaper$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return this.f$0.escape((String) obj);
        }
    };

    public abstract String escape(String string);

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }
}
