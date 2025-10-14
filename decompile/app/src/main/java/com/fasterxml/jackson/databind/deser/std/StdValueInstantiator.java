package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* loaded from: classes7.dex */
public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    public static final long serialVersionUID = 1;
    public SettableBeanProperty[] _arrayDelegateArguments;
    public AnnotatedWithParams _arrayDelegateCreator;
    public JavaType _arrayDelegateType;
    public SettableBeanProperty[] _constructorArguments;
    public AnnotatedWithParams _defaultCreator;
    public SettableBeanProperty[] _delegateArguments;
    public AnnotatedWithParams _delegateCreator;
    public JavaType _delegateType;
    public AnnotatedWithParams _fromBigDecimalCreator;
    public AnnotatedWithParams _fromBigIntegerCreator;
    public AnnotatedWithParams _fromBooleanCreator;
    public AnnotatedWithParams _fromDoubleCreator;
    public AnnotatedWithParams _fromIntCreator;
    public AnnotatedWithParams _fromLongCreator;
    public AnnotatedWithParams _fromStringCreator;
    public final Class<?> _valueClass;
    public final String _valueTypeDesc;
    public AnnotatedWithParams _withArgsCreator;

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r2v0, types: [java.lang.Class, java.lang.Class<?>] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StdValueInstantiator(DeserializationConfig deserializationConfig, Class cls) {
        this._valueTypeDesc = ClassUtil.nameOf(cls);
        this._valueClass = cls == null ? Object.class : cls;
    }

    public StdValueInstantiator(DeserializationConfig deserializationConfig, JavaType javaType) {
        this._valueTypeDesc = javaType == null ? "UNKNOWN TYPE" : javaType.toString();
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
    }

    public StdValueInstantiator(StdValueInstantiator stdValueInstantiator) {
        this._valueTypeDesc = stdValueInstantiator._valueTypeDesc;
        this._valueClass = stdValueInstantiator._valueClass;
        this._defaultCreator = stdValueInstantiator._defaultCreator;
        this._constructorArguments = stdValueInstantiator._constructorArguments;
        this._withArgsCreator = stdValueInstantiator._withArgsCreator;
        this._delegateType = stdValueInstantiator._delegateType;
        this._delegateCreator = stdValueInstantiator._delegateCreator;
        this._delegateArguments = stdValueInstantiator._delegateArguments;
        this._arrayDelegateType = stdValueInstantiator._arrayDelegateType;
        this._arrayDelegateCreator = stdValueInstantiator._arrayDelegateCreator;
        this._arrayDelegateArguments = stdValueInstantiator._arrayDelegateArguments;
        this._fromStringCreator = stdValueInstantiator._fromStringCreator;
        this._fromIntCreator = stdValueInstantiator._fromIntCreator;
        this._fromLongCreator = stdValueInstantiator._fromLongCreator;
        this._fromBigIntegerCreator = stdValueInstantiator._fromBigIntegerCreator;
        this._fromDoubleCreator = stdValueInstantiator._fromDoubleCreator;
        this._fromBigDecimalCreator = stdValueInstantiator._fromBigDecimalCreator;
        this._fromBooleanCreator = stdValueInstantiator._fromBooleanCreator;
    }

    public void configureFromObjectSettings(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedWithParams annotatedWithParams3, SettableBeanProperty[] settableBeanPropertyArr2) {
        this._defaultCreator = annotatedWithParams;
        this._delegateCreator = annotatedWithParams2;
        this._delegateType = javaType;
        this._delegateArguments = settableBeanPropertyArr;
        this._withArgsCreator = annotatedWithParams3;
        this._constructorArguments = settableBeanPropertyArr2;
    }

    public void configureFromArraySettings(AnnotatedWithParams annotatedWithParams, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr) {
        this._arrayDelegateCreator = annotatedWithParams;
        this._arrayDelegateType = javaType;
        this._arrayDelegateArguments = settableBeanPropertyArr;
    }

    public void configureFromStringCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromStringCreator = annotatedWithParams;
    }

    public void configureFromIntCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromIntCreator = annotatedWithParams;
    }

    public void configureFromLongCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromLongCreator = annotatedWithParams;
    }

    public void configureFromBigIntegerCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBigIntegerCreator = annotatedWithParams;
    }

    public void configureFromDoubleCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromDoubleCreator = annotatedWithParams;
    }

    public void configureFromBigDecimalCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBigDecimalCreator = annotatedWithParams;
    }

    public void configureFromBooleanCreator(AnnotatedWithParams annotatedWithParams) {
        this._fromBooleanCreator = annotatedWithParams;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public String getValueTypeDesc() {
        return this._valueTypeDesc;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Class<?> getValueClass() {
        return this._valueClass;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromString() {
        return this._fromStringCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromInt() {
        return this._fromIntCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromLong() {
        return this._fromLongCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBigInteger() {
        return this._fromBigIntegerCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromDouble() {
        return this._fromDoubleCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBigDecimal() {
        return this._fromBigDecimalCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromBoolean() {
        return this._fromBooleanCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingDefault() {
        return this._defaultCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingDelegate() {
        return this._delegateType != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateUsingArrayDelegate() {
        return this._arrayDelegateType != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return this._withArgsCreator != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return this._delegateType;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public JavaType getArrayDelegateType(DeserializationConfig deserializationConfig) {
        return this._arrayDelegateType;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return this._constructorArguments;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._defaultCreator;
        if (annotatedWithParams == null) {
            return super.createUsingDefault(deserializationContext);
        }
        try {
            return annotatedWithParams.call();
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, null, rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._withArgsCreator;
        if (annotatedWithParams == null) {
            return super.createFromObjectWith(deserializationContext, objArr);
        }
        try {
            return annotatedWithParams.call(objArr);
        } catch (Exception e) {
            return deserializationContext.handleInstantiationProblem(this._valueClass, objArr, rewrapCtorProblem(deserializationContext, e));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams;
        AnnotatedWithParams annotatedWithParams2 = this._delegateCreator;
        if (annotatedWithParams2 == null && (annotatedWithParams = this._arrayDelegateCreator) != null) {
            return _createUsingDelegate(annotatedWithParams, this._arrayDelegateArguments, deserializationContext, obj);
        }
        return _createUsingDelegate(annotatedWithParams2, this._delegateArguments, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._arrayDelegateCreator;
        if (annotatedWithParams == null && this._delegateCreator != null) {
            return createUsingDelegate(deserializationContext, obj);
        }
        return _createUsingDelegate(annotatedWithParams, this._arrayDelegateArguments, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._fromStringCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(str);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this._fromStringCreator.getDeclaringClass(), str, rewrapCtorProblem(deserializationContext, th));
            }
        }
        return super.createFromString(deserializationContext, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromInt(DeserializationContext deserializationContext, int i) throws IOException {
        if (this._fromIntCreator != null) {
            Integer numValueOf = Integer.valueOf(i);
            try {
                return this._fromIntCreator.call1(numValueOf);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this._fromIntCreator.getDeclaringClass(), numValueOf, rewrapCtorProblem(deserializationContext, th));
            }
        }
        if (this._fromLongCreator != null) {
            Long lValueOf = Long.valueOf(i);
            try {
                return this._fromLongCreator.call1(lValueOf);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), lValueOf, rewrapCtorProblem(deserializationContext, th2));
            }
        }
        if (this._fromBigIntegerCreator != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(i);
            try {
                return this._fromBigIntegerCreator.call1(bigIntegerValueOf);
            } catch (Throwable th3) {
                return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), bigIntegerValueOf, rewrapCtorProblem(deserializationContext, th3));
            }
        }
        return super.createFromInt(deserializationContext, i);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        if (this._fromLongCreator != null) {
            Long lValueOf = Long.valueOf(j);
            try {
                return this._fromLongCreator.call1(lValueOf);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this._fromLongCreator.getDeclaringClass(), lValueOf, rewrapCtorProblem(deserializationContext, th));
            }
        }
        if (this._fromBigIntegerCreator != null) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
            try {
                return this._fromBigIntegerCreator.call1(bigIntegerValueOf);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), bigIntegerValueOf, rewrapCtorProblem(deserializationContext, th2));
            }
        }
        return super.createFromLong(deserializationContext, j);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBigInteger(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        AnnotatedWithParams annotatedWithParams = this._fromBigIntegerCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(bigInteger);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this._fromBigIntegerCreator.getDeclaringClass(), bigInteger, rewrapCtorProblem(deserializationContext, th));
            }
        }
        return super.createFromBigInteger(deserializationContext, bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromDouble(DeserializationContext deserializationContext, double d) throws IOException {
        if (this._fromDoubleCreator != null) {
            Double dValueOf = Double.valueOf(d);
            try {
                return this._fromDoubleCreator.call1(dValueOf);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this._fromDoubleCreator.getDeclaringClass(), dValueOf, rewrapCtorProblem(deserializationContext, th));
            }
        }
        if (this._fromBigDecimalCreator != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
            try {
                return this._fromBigDecimalCreator.call1(bigDecimalValueOf);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this._fromBigDecimalCreator.getDeclaringClass(), bigDecimalValueOf, rewrapCtorProblem(deserializationContext, th2));
            }
        }
        return super.createFromDouble(deserializationContext, d);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBigDecimal(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        Double dTryConvertToDouble;
        AnnotatedWithParams annotatedWithParams = this._fromBigDecimalCreator;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.call1(bigDecimal);
            } catch (Throwable th) {
                return deserializationContext.handleInstantiationProblem(this._fromBigDecimalCreator.getDeclaringClass(), bigDecimal, rewrapCtorProblem(deserializationContext, th));
            }
        }
        if (this._fromDoubleCreator != null && (dTryConvertToDouble = tryConvertToDouble(bigDecimal)) != null) {
            try {
                return this._fromDoubleCreator.call1(dTryConvertToDouble);
            } catch (Throwable th2) {
                return deserializationContext.handleInstantiationProblem(this._fromDoubleCreator.getDeclaringClass(), dTryConvertToDouble, rewrapCtorProblem(deserializationContext, th2));
            }
        }
        return super.createFromBigDecimal(deserializationContext, bigDecimal);
    }

    public static Double tryConvertToDouble(BigDecimal bigDecimal) {
        double dDoubleValue = bigDecimal.doubleValue();
        if (Double.isInfinite(dDoubleValue)) {
            return null;
        }
        return Double.valueOf(dDoubleValue);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z) throws IOException {
        if (this._fromBooleanCreator == null) {
            return super.createFromBoolean(deserializationContext, z);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            return this._fromBooleanCreator.call1(boolValueOf);
        } catch (Throwable th) {
            return deserializationContext.handleInstantiationProblem(this._fromBooleanCreator.getDeclaringClass(), boolValueOf, rewrapCtorProblem(deserializationContext, th));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getDelegateCreator() {
        return this._delegateCreator;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getArrayDelegateCreator() {
        return this._arrayDelegateCreator;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getDefaultCreator() {
        return this._defaultCreator;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public AnnotatedWithParams getWithArgsCreator() {
        return this._withArgsCreator;
    }

    @Deprecated
    public JsonMappingException wrapException(Throwable th) {
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof JsonMappingException) {
                return (JsonMappingException) cause;
            }
        }
        return new JsonMappingException((Closeable) null, "Instantiation of " + getValueTypeDesc() + " value failed: " + ClassUtil.exceptionMessage(th), th);
    }

    @Deprecated
    public JsonMappingException unwrapAndWrapException(DeserializationContext deserializationContext, Throwable th) {
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof JsonMappingException) {
                return (JsonMappingException) cause;
            }
        }
        return deserializationContext.instantiationException(getValueClass(), th);
    }

    public JsonMappingException wrapAsJsonMappingException(DeserializationContext deserializationContext, Throwable th) {
        if (th instanceof JsonMappingException) {
            return (JsonMappingException) th;
        }
        return deserializationContext.instantiationException(getValueClass(), th);
    }

    public JsonMappingException rewrapCtorProblem(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        return wrapAsJsonMappingException(deserializationContext, th);
    }

    public final Object _createUsingDelegate(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (annotatedWithParams == null) {
            throw new IllegalStateException("No delegate constructor for " + getValueTypeDesc());
        }
        try {
            if (settableBeanPropertyArr == null) {
                return annotatedWithParams.call1(obj);
            }
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty == null) {
                    objArr[i] = obj;
                } else {
                    objArr[i] = deserializationContext.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
                }
            }
            return annotatedWithParams.call(objArr);
        } catch (Throwable th) {
            throw rewrapCtorProblem(deserializationContext, th);
        }
    }
}
