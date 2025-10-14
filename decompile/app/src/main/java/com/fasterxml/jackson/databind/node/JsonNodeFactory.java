package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes6.dex */
public class JsonNodeFactory implements Serializable, JsonNodeCreator {
    public static final int MAX_ELEMENT_INDEX_FOR_INSERT = 9999;
    public static final JsonNodeFactory decimalsAsIs;
    public static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    public static final long serialVersionUID = 1;
    public final boolean _cfgBigDecimalExact;

    public boolean _inIntRange(long j) {
        return ((long) ((int) j)) == j;
    }

    public int getMaxElementIndexForInsert() {
        return 9999;
    }

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        decimalsNormalized = jsonNodeFactory;
        decimalsAsIs = new JsonNodeFactory(true);
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    public JsonNodeFactory() {
        this(false);
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z) {
        return z ? decimalsAsIs : decimalsNormalized;
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public BooleanNode booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public JsonNode missingNode() {
        return MissingNode.getInstance();
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(byte b) {
        return IntNode.valueOf(b);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Byte b) {
        return b == null ? nullNode() : IntNode.valueOf(b.intValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(short s) {
        return ShortNode.valueOf(s);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Short sh) {
        return sh == null ? nullNode() : ShortNode.valueOf(sh.shortValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(int i) {
        return IntNode.valueOf(i);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Integer num) {
        return num == null ? nullNode() : IntNode.valueOf(num.intValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(long j) {
        return LongNode.valueOf(j);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Long l) {
        if (l == null) {
            return nullNode();
        }
        return LongNode.valueOf(l.longValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Float f) {
        return f == null ? nullNode() : FloatNode.valueOf(f.floatValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public NumericNode numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(Double d) {
        return d == null ? nullNode() : DoubleNode.valueOf(d.doubleValue());
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return nullNode();
        }
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        if (bigDecimal.signum() == 0) {
            return DecimalNode.ZERO;
        }
        try {
            bigDecimal = DecimalNode$$ExternalSyntheticBackportWithForwarding0.m1037m(bigDecimal);
        } catch (ArithmeticException unused) {
        }
        return DecimalNode.valueOf(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public BinaryNode binaryNode(byte[] bArr, int i, int i2) {
        return BinaryNode.valueOf(bArr, i, i2);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ArrayNode arrayNode(int i) {
        return new ArrayNode(this, i);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    @Override // com.fasterxml.jackson.databind.node.JsonNodeCreator
    public ValueNode rawValueNode(RawValue rawValue) {
        return new POJONode(rawValue);
    }
}
