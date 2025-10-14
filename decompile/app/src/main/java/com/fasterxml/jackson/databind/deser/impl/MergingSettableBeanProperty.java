package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;

/* loaded from: classes6.dex */
public class MergingSettableBeanProperty extends SettableBeanProperty.Delegating {
    public static final long serialVersionUID = 1;
    public final AnnotatedMember _accessor;

    public MergingSettableBeanProperty(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        super(settableBeanProperty);
        this._accessor = annotatedMember;
    }

    public MergingSettableBeanProperty(MergingSettableBeanProperty mergingSettableBeanProperty, SettableBeanProperty settableBeanProperty) {
        super(settableBeanProperty);
        this._accessor = mergingSettableBeanProperty._accessor;
    }

    public static MergingSettableBeanProperty construct(SettableBeanProperty settableBeanProperty, AnnotatedMember annotatedMember) {
        return new MergingSettableBeanProperty(settableBeanProperty, annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        return new MergingSettableBeanProperty(settableBeanProperty, this._accessor);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Object objDeserializeWith;
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            objDeserializeWith = this.delegate.deserialize(jsonParser, deserializationContext);
        } else {
            objDeserializeWith = this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        }
        if (objDeserializeWith != value) {
            this.delegate.set(obj, objDeserializeWith);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Object objDeserializeWith;
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            objDeserializeWith = this.delegate.deserialize(jsonParser, deserializationContext);
        } else {
            objDeserializeWith = this.delegate.deserializeWith(jsonParser, deserializationContext, value);
        }
        return (objDeserializeWith == value || objDeserializeWith == null) ? obj : this.delegate.setAndReturn(obj, objDeserializeWith);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            this.delegate.set(obj, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return obj2 != null ? this.delegate.setAndReturn(obj, obj2) : obj;
    }
}
