package androidx.constraintlayout.compose;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.p003ui.layout.Measurable;
import androidx.constraintlayout.compose.DerivedConstraintSet;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JSONConstraintSet.kt */
@Metadata(m7104d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0016\u0010#\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m7105d2 = {"Landroidx/constraintlayout/compose/JSONConstraintSet;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "content", "", "overrideVariables", "extendFrom", "Landroidx/constraintlayout/compose/ConstraintSet;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/ConstraintSet;)V", "_isDirty", "", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "overridedVariables", "Ljava/util/HashMap;", "", "applyLayoutVariables", "", "layoutVariables", "Landroidx/constraintlayout/compose/LayoutVariables;", "applyTo", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/constraintlayout/core/state/Transition;", "type", "", "applyToState", "state", "Landroidx/constraintlayout/compose/State;", "emitDesignElements", "designElements", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "equals", "other", "", "isDirty", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "onNewContent", "override", "name", "value", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {
    public boolean _isDirty;

    @Nullable
    public final ConstraintSet extendFrom;

    @Nullable
    public final String overrideVariables;

    @NotNull
    public final HashMap<String, Float> overridedVariables;

    public /* synthetic */ JSONConstraintSet(String str, String str2, ConstraintSet constraintSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : constraintSet);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet, androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@NotNull State state, @NotNull List<? extends Measurable> list) {
        DerivedConstraintSet.DefaultImpls.applyTo(this, state, list);
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    @Nullable
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSONConstraintSet(@Language("json5") @NotNull String content, @Language("json5") @Nullable String str, @Nullable ConstraintSet constraintSet) {
        super(content);
        Intrinsics.checkNotNullParameter(content, "content");
        this.extendFrom = constraintSet;
        this.overridedVariables = new HashMap<>();
        this.overrideVariables = str;
        this._isDirty = true;
        initialization();
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof JSONConstraintSet) {
            return Intrinsics.areEqual(getCurrentContent(), ((JSONConstraintSet) other).getCurrentContent());
        }
        return false;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@NotNull List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return this._isDirty;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@NotNull androidx.constraintlayout.core.state.Transition transition, int type) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        applyLayoutVariables(new LayoutVariables());
        ConstraintSetParserKt.parseJSON(getCurrentContent(), transition, type);
    }

    public final void emitDesignElements(@NotNull ArrayList<DesignElement> designElements) {
        Intrinsics.checkNotNullParameter(designElements, "designElements");
        try {
            designElements.clear();
            ConstraintSetParserKt.parseDesignElementsJSON(getCurrentContent(), designElements);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        LayoutVariables layoutVariables = new LayoutVariables();
        applyLayoutVariables(layoutVariables);
        try {
            ConstraintSetParserKt.parseJSON(getCurrentContent(), state, layoutVariables);
            this._isDirty = false;
        } catch (Exception unused) {
            this._isDirty = true;
        }
    }

    @Override // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        super.onNewContent(content);
        this._isDirty = true;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    @NotNull
    public ConstraintSet override(@NotNull String name, float value) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.overridedVariables.put(name, Float.valueOf(value));
        return this;
    }

    public final void applyLayoutVariables(LayoutVariables layoutVariables) {
        String str = this.overrideVariables;
        if (str != null) {
            try {
                CLObject cLObject = CLParser.parse(str);
                int size = cLObject.size();
                if (size > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        CLElement cLElement = cLObject.get(i);
                        if (cLElement == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                        }
                        CLKey cLKey = (CLKey) cLElement;
                        float f = cLKey.getValue().getFloat();
                        String strContent = cLKey.content();
                        Intrinsics.checkNotNullExpressionValue(strContent, "key.content()");
                        layoutVariables.putOverride(strContent, f);
                        if (i2 >= size) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                }
            } catch (CLParsingException e) {
                System.err.println(Intrinsics.stringPlus("exception: ", e));
            }
        }
        for (String name : this.overridedVariables.keySet()) {
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Float f2 = this.overridedVariables.get(name);
            Intrinsics.checkNotNull(f2);
            layoutVariables.putOverride(name, f2.floatValue());
        }
    }
}
