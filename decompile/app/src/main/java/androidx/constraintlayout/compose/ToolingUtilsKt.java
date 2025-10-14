package androidx.constraintlayout.compose;

import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.semantics.SemanticsPropertyKey;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ToolingUtils.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a0\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u001aH\u0000\u001a$\u0010'\u001a\n (*\u0004\u0018\u00010 0 *\u00020)2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010*\u001a\u00020\u001a*\u00020)2\u0006\u0010\"\u001a\u00020#H\u0002\u001a\u000e\u0010+\u001a\u00020\u001a*\u0004\u0018\u00010)H\u0002\u001aV\u0010,\u001a\u00020\u0015*\u00020 2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a022\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002002\b\b\u0002\u00106\u001a\u000200H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"5\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00068@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00067"}, m7105d2 = {"BOUNDS", "", "CONSTRAINTS", "CONSTRAINTS_JSON_VERSION", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "designInfoProvider", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "designInfoProvider$delegate", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "addReferencesIds", "", "helperWidget", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperReferences", "", "", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "rootId", "createDesignInfoJson", "content", "Lorg/json/JSONObject;", "parseConstraintsToJson", "state", "Landroidx/constraintlayout/compose/State;", "startX", "startY", "args", "boundsToJson", "kotlin.jvm.PlatformType", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "getHelperId", "getRefId", "putViewIdToBoundsAndConstraints", "viewId", "boxJson", "isHelper", "", "isRoot", "", "constraintsInfoArray", "Lorg/json/JSONArray;", "withConstraints", "withBounds", "compose_release"}, m7106k = 2, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ToolingUtilsKt {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(ToolingUtilsKt.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
    public static final int BOUNDS = 1;
    public static final int CONSTRAINTS = 0;
    public static final int CONSTRAINTS_JSON_VERSION = 1;

    @NotNull
    public static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey;

    @NotNull
    public static final SemanticsPropertyKey designInfoProvider$delegate;

    @PublishedApi
    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @NotNull
    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    static {
        SemanticsPropertyKey<DesignInfoProvider> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, 0 == true ? 1 : 0);
        DesignInfoDataKey = semanticsPropertyKey;
        designInfoProvider$delegate = semanticsPropertyKey;
    }

    @NotNull
    public static final DesignInfoProvider getDesignInfoProvider(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return (DesignInfoProvider) designInfoProvider$delegate.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setDesignInfoProvider(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull DesignInfoProvider designInfoProvider) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(designInfoProvider, "<set-?>");
        designInfoProvider$delegate.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }

    @NotNull
    public static final String parseConstraintsToJson(@NotNull ConstraintWidgetContainer root, @NotNull State state, int i, int i2, @NotNull String args) throws JSONException {
        boolean z;
        boolean z2;
        String refId;
        State state2 = state;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(args, "args");
        String strValueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject = new JSONObject();
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(args);
        if (intOrNull == null) {
            z = true;
            z2 = true;
        } else {
            int iIntValue = intOrNull.intValue();
            boolean z3 = (iIntValue >> 1) == 1;
            z = iIntValue == 1;
            z2 = z3;
        }
        ArrayList<ConstraintWidget> children = root.getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "root.children");
        for (ConstraintWidget constraintWidget : children) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            boolean z4 = constraintWidget instanceof HelperWidget;
            String widgetId = constraintWidget.stringId;
            if (z4) {
                addReferencesIds((HelperWidget) constraintWidget, arrayList, root, strValueOf);
            }
            ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
            Intrinsics.checkNotNullExpressionValue(anchors, "constraintWidget.anchors");
            for (ConstraintAnchor constraintAnchor : anchors) {
                if (constraintAnchor.isConnected()) {
                    ConstraintWidget targetWidget = constraintAnchor.getTarget().getOwner();
                    boolean z5 = targetWidget instanceof HelperWidget;
                    if (Intrinsics.areEqual(root, targetWidget)) {
                        refId = strValueOf;
                    } else if (z5) {
                        Intrinsics.checkNotNullExpressionValue(targetWidget, "targetWidget");
                        refId = getHelperId(targetWidget, state2);
                    } else {
                        refId = getRefId(targetWidget);
                    }
                    JSONObject jSONObjectPut = new JSONObject().put("originAnchor", constraintAnchor.getType());
                    ConstraintAnchor target = constraintAnchor.getTarget();
                    Intrinsics.checkNotNull(target);
                    jSONArray.put(jSONObjectPut.put("targetAnchor", target.getType()).put("target", refId).put("margin", constraintAnchor.getMargin()));
                }
                state2 = state;
            }
            Intrinsics.checkNotNullExpressionValue(widgetId, "widgetId");
            Intrinsics.checkNotNullExpressionValue(constraintWidget, "constraintWidget");
            JSONObject jSONObjectBoundsToJson = boundsToJson(constraintWidget, i, i2);
            Intrinsics.checkNotNullExpressionValue(jSONObjectBoundsToJson, "constraintWidget.boundsToJson(startX, startY)");
            putViewIdToBoundsAndConstraints(jSONObject, widgetId, jSONObjectBoundsToJson, constraintWidget instanceof HelperWidget, false, arrayList, jSONArray, z, z2);
            state2 = state;
        }
        JSONObject jSONObjectBoundsToJson2 = boundsToJson(root, i, i2);
        Intrinsics.checkNotNullExpressionValue(jSONObjectBoundsToJson2, "root.boundsToJson(startX, startY)");
        putViewIdToBoundsAndConstraints(jSONObject, strValueOf, jSONObjectBoundsToJson2, false, true, CollectionsKt__CollectionsKt.emptyList(), new JSONArray(), z, z2);
        return createDesignInfoJson(jSONObject);
    }

    public static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        int i = helperWidget.mWidgetsCount;
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            ConstraintWidget constraintWidget = helperWidget.mWidgets[i2];
            list.add(Intrinsics.areEqual(constraintWidget, constraintWidgetContainer) ? str : getRefId(constraintWidget));
            if (i3 >= i) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        return String.valueOf(state.getKeyId$compose_release((HelperWidget) constraintWidget));
    }

    public static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        Object companionWidget = constraintWidget == null ? null : constraintWidget.getCompanionWidget();
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        String string = (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null) ? null : layoutId.toString();
        if (string == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return string;
    }

    public static final String createDesignInfoJson(JSONObject jSONObject) {
        String string = new JSONObject().put("type", "CONSTRAINTS").put("version", 1).put("content", jSONObject).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n    .put(\"type\", \"CONSTRAINTS\")\n    .put(\"version\", CONSTRAINTS_JSON_VERSION)\n    .put(\"content\", content).toString()");
        return string;
    }

    public static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i, int i2) {
        return new JSONObject().put(TtmlNode.LEFT, constraintWidget.getLeft() + i).put("top", constraintWidget.getTop() + i2).put(TtmlNode.RIGHT, constraintWidget.getRight() + i).put("bottom", constraintWidget.getBottom() + i2);
    }

    public static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z, boolean z2, List<String> list, JSONArray jSONArray, boolean z3, boolean z4) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z4) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z);
        jSONObject3.put("isRoot", z2);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next());
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z3) {
            jSONObject3.put("constraints", jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }
}
