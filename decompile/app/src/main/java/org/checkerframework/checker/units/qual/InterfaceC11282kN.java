package org.checkerframework.checker.units.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UnitsMultiple(prefix = Prefix.kilo, quantity = InterfaceC11278N.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({Force.class})
/* renamed from: org.checkerframework.checker.units.qual.kN */
/* loaded from: classes8.dex */
public @interface InterfaceC11282kN {
}
