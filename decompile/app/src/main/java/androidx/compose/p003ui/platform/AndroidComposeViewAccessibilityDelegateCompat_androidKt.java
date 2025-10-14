package androidx.compose.p003ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.semantics.AccessibilityAction;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsActions;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p003ui.semantics.SemanticsNode;
import androidx.compose.p003ui.semantics.SemanticsOwner;
import androidx.compose.p003ui.semantics.SemanticsProperties;
import androidx.compose.p003ui.semantics.SemanticsPropertyKey;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.util.ListUtilsKt;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import com.google.android.material.chip.Chip;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(m7104d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u001c\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002\u001a\f\u0010 \u001a\u00020\u0003*\u00020\rH\u0002\u001a\f\u0010!\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u001c\u0010\"\u001a\u0004\u0018\u00010#*\b\u0012\u0004\u0012\u00020#0$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\"\u0010'\u001a\u0004\u0018\u00010(*\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030*H\u0002\u001a\u0018\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-0,*\u00020.H\u0002\u001a\u000e\u0010/\u001a\u0004\u0018\u00010\f*\u00020\rH\u0002\u001a\f\u00100\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u0014\u00101\u001a\u00020\u0003*\u00020(2\u0006\u00102\u001a\u00020(H\u0002\u001a\f\u00103\u001a\u00020\u0003*\u00020\rH\u0002\u001a\u0014\u00104\u001a\u00020\u0003*\u00020\r2\u0006\u00105\u001a\u000206H\u0002\u001a\u0016\u00107\u001a\u0004\u0018\u000108*\u0002092\u0006\u0010%\u001a\u00020&H\u0000\u001a\u0018\u0010:\u001a\u0004\u0018\u00010\f*\u00020;H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0019\u0010\u0012\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0019\u0010\u0013\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u0019\u0010\u0014\u001a\u00020\u0003*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0011\"\u0019\u0010\u0018\u001a\u00020\u0019*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m7105d2 = {"DefaultFakeNodeBounds", "Landroidx/compose/ui/geometry/Rect;", "<set-?>", "", "DisableContentCapture", "getDisableContentCapture$annotations", "()V", "getDisableContentCapture", "()Z", "setDisableContentCapture", "(Z)V", "infoContentDescriptionOrNull", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getInfoContentDescriptionOrNull", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "isPassword", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isRtl", "isTextField", "isTraversalGroup", "isVisible", "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "traversalIndex", "", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsNode;)F", "accessibilityEquals", "Landroidx/compose/ui/semantics/AccessibilityAction;", "other", "", "enabled", "excludeLineAndPageGranularities", "findById", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "", "findClosestParentNode", "Landroidx/compose/ui/node/LayoutNode;", "selector", "Lkotlin/Function1;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getTextForTranslation", "hasPaneTitle", "isAncestorOf", "node", "isImportantForAccessibility", "propertiesDeleted", "oldConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsIdToView", "Landroid/view/View;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "toLegacyClassName", "Landroidx/compose/ui/semantics/Role;", "toLegacyClassName-V4PA4sw", "(I)Ljava/lang/String;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3790:1\n3585#1:3791\n288#2,2:3792\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n3599#1:3791\n3771#1:3792,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    @NotNull
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
    private static boolean DisableContentCapture;

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    private static /* synthetic */ void isVisible$annotations(SemanticsNode semanticsNode) {
    }

    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    public static final boolean enabled(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig().containsImportantForAccessibility$ui_release();
    }

    public static final boolean isVisible(SemanticsNode semanticsNode) {
        return (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) ? false : true;
    }

    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    private static final boolean isPassword(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    private static final boolean isTextField(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText());
    }

    private static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1\n*L\n1#1,3790:1\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1 */
    /* loaded from: classes.dex */
    public static final class C19601 extends Lambda implements Function0<Boolean> {
        public static final C19601 INSTANCE = new C19601();

        public C19601() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean isTraversalGroup(SemanticsNode semanticsNode) {
        return ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), C19601.INSTANCE)).booleanValue();
    }

    private static final float getTraversalIndex(SemanticsNode semanticsNode) {
        return ((Number) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), C1961x7f5b24ff.INSTANCE)).floatValue();
    }

    public static final String getInfoContentDescriptionOrNull(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            return (String) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    public static final String getTextForTranslation(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            return ListUtilsKt.fastJoinToString$default(list, StringUtils.f9903LF, null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.areEqual(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner) {
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode().isPlaced() && unmergedRootSemanticsNode.getLayoutNode().isAttached()) {
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(new Region(MathKt__MathJVMKt.roundToInt(boundsInRoot.getLeft()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getTop()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getRight()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getBottom())), unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode, new Region());
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2, Region region2) {
        Rect boundsInRoot;
        LayoutInfo layoutInfo;
        boolean z = (semanticsNode2.getLayoutNode().isPlaced() && semanticsNode2.getLayoutNode().isAttached()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.getIsFake()) {
                Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
                int iRoundToInt = MathKt__MathJVMKt.roundToInt(touchBoundsInRoot.getLeft());
                int iRoundToInt2 = MathKt__MathJVMKt.roundToInt(touchBoundsInRoot.getTop());
                int iRoundToInt3 = MathKt__MathJVMKt.roundToInt(touchBoundsInRoot.getRight());
                int iRoundToInt4 = MathKt__MathJVMKt.roundToInt(touchBoundsInRoot.getBottom());
                region2.set(iRoundToInt, iRoundToInt2, iRoundToInt3, iRoundToInt4);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (region2.op(region, Region.Op.INTERSECT)) {
                    map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                    List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                    for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                        getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size), region2);
                    }
                    if (isImportantForAccessibility(semanticsNode2)) {
                        region.op(iRoundToInt, iRoundToInt2, iRoundToInt3, iRoundToInt4, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (!semanticsNode2.getIsFake()) {
                    if (id == -1) {
                        map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                        return;
                    }
                    return;
                }
                SemanticsNode parent = semanticsNode2.getParent();
                if (parent != null && (layoutInfo = parent.getLayoutInfo()) != null && layoutInfo.isPlaced()) {
                    boundsInRoot = parent.getBoundsInRoot();
                } else {
                    boundsInRoot = DefaultFakeNodeBounds;
                }
                map.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(MathKt__MathJVMKt.roundToInt(boundsInRoot.getLeft()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getTop()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getRight()), MathKt__MathJVMKt.roundToInt(boundsInRoot.getBottom()))));
            }
        }
    }

    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: toLegacyClassName-V4PA4sw */
    public static final String m12910toLegacyClassNameV4PA4sw(int i) {
        Role.Companion companion = Role.INSTANCE;
        if (Role.m12989equalsimpl0(i, companion.m12993getButtono7Vup1c())) {
            return Chip.BUTTON_ACCESSIBILITY_CLASS_NAME;
        }
        if (Role.m12989equalsimpl0(i, companion.m12994getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m12989equalsimpl0(i, companion.m12997getRadioButtono7Vup1c())) {
            return Chip.RADIO_BUTTON_ACCESSIBILITY_CLASS_NAME;
        }
        if (Role.m12989equalsimpl0(i, companion.m12996getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m12989equalsimpl0(i, companion.m12995getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    @Nullable
    public static final View semanticsIdToView(@NotNull AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final boolean isAncestorOf(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
        if (parent$ui_release == null) {
            return false;
        }
        return Intrinsics.areEqual(parent$ui_release, layoutNode) || isAncestorOf(layoutNode, parent$ui_release);
    }

    @ExperimentalComposeUiApi
    public static final boolean getDisableContentCapture() {
        return DisableContentCapture;
    }

    @ExperimentalComposeUiApi
    public static final void setDisableContentCapture(boolean z) {
        DisableContentCapture = z;
    }

    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText()) && !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeFindClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode(), new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(@NotNull LayoutNode layoutNode) {
                boolean z;
                SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
                if (collapsedSemantics$ui_release != null) {
                    z = collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants() && collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText());
                }
                return Boolean.valueOf(z);
            }
        });
        if (layoutNodeFindClosestParentNode != null) {
            SemanticsConfiguration collapsedSemantics$ui_release = layoutNodeFindClosestParentNode.getCollapsedSemantics$ui_release();
            if (!(collapsedSemantics$ui_release != null ? Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }
}
