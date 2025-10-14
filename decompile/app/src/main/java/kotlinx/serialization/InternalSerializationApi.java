package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.METHOD})
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION, AnnotationTarget.TYPEALIAS})
@Retention(RetentionPolicy.RUNTIME)
@MustBeDocumented
@Metadata(m7104d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m7105d2 = {"Lkotlinx/serialization/InternalSerializationApi;", "", "kotlinx-serialization-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Documented
/* loaded from: classes6.dex */
public @interface InternalSerializationApi {
}
