package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusModifierKt;
import androidx.compose.p003ui.focus.FocusProperties;
import androidx.compose.p003ui.focus.FocusPropertiesKt;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectableModifier;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Focusable.kt */
@Metadata(m7104d1 = {"\u0000%\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0007\u001a \u0010\u0007\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u001e\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"FocusableInNonTouchModeElement", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "focusGroupInspectorInfo", "Landroidx/compose/ui/platform/InspectableModifier;", "focusGroup", "Landroidx/compose/ui/Modifier;", "focusable", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "focusableInNonTouchMode", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,374:1\n146#2:375\n135#2:376\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n126#1:375\n114#1:376\n*E\n"})
/* loaded from: classes2.dex */
public final class FocusableKt {

    @NotNull
    private static final FocusableKt$FocusableInNonTouchModeElement$1 FocusableInNonTouchModeElement;

    @NotNull
    private static final InspectableModifier focusGroupInspectorInfo;

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    @NotNull
    public static final Modifier focusable(@NotNull Modifier modifier, boolean z, @Nullable MutableInteractionSource mutableInteractionSource) {
        Modifier modifierFocusTarget;
        if (z) {
            modifierFocusTarget = FocusModifierKt.focusTarget(new FocusableElement(mutableInteractionSource));
        } else {
            modifierFocusTarget = Modifier.INSTANCE;
        }
        return modifier.then(modifierFocusTarget);
    }

    /* compiled from: Focusable.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/focus/FocusProperties;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusGroup$1 */
    /* loaded from: classes3.dex */
    public static final class C03981 extends Lambda implements Function1<FocusProperties, Unit> {
        public static final C03981 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
            invoke2(focusProperties);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull FocusProperties focusProperties) {
            focusProperties.setCanFocus(false);
        }
    }

    @Stable
    @NotNull
    public static final Modifier focusGroup(@NotNull Modifier modifier) {
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier.then(focusGroupInspectorInfo), C03981.INSTANCE));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        focusGroupInspectorInfo = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
        FocusableInNonTouchModeElement = new ModifierNodeElement<FocusableInNonTouchMode>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public boolean equals(@Nullable Object other) {
                return this == other;
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public void update(@NotNull FocusableInNonTouchMode node) {
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            @NotNull
            public FocusableInNonTouchMode create() {
                return new FocusableInNonTouchMode();
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // androidx.compose.p003ui.node.ModifierNodeElement
            public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusableInNonTouchMode");
            }
        };
    }

    /* compiled from: Focusable.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$1 */
    /* loaded from: classes3.dex */
    public static final class C03991 extends Lambda implements Function1<InspectorInfo, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03991(boolean z, MutableInteractionSource mutableInteractionSource) {
            super(1);
            z = z;
            mutableInteractionSource = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusableInNonTouchMode");
            inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
            inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
        }
    }

    @NotNull
    public static final Modifier focusableInNonTouchMode(@NotNull Modifier modifier, boolean z, @Nullable MutableInteractionSource mutableInteractionSource) {
        return InspectableValueKt.inspectableWrapper(modifier, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.1
            public final /* synthetic */ boolean $enabled;
            public final /* synthetic */ MutableInteractionSource $interactionSource;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03991(boolean z2, MutableInteractionSource mutableInteractionSource2) {
                super(1);
                z = z2;
                mutableInteractionSource = mutableInteractionSource2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusableInNonTouchMode");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        }, focusable(Modifier.INSTANCE.then(FocusableInNonTouchModeElement), z2, mutableInteractionSource2));
    }
}
