package com.blackhub.bronline.game.gui.familysystem;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.databinding.FamiliesMainLayoutBinding;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIMailLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/UIMailLayout;", "Lcom/blackhub/bronline/game/common/UILayout;", "mainRoot", "Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;", "actionsWithJSON", "Lcom/blackhub/bronline/game/gui/familysystem/network/ActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/familysystem/GUIFamilySystem;Lcom/blackhub/bronline/game/gui/familysystem/network/ActionsWithJSON;)V", "binding", "Lcom/blackhub/bronline/databinding/FamiliesMainLayoutBinding;", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "getView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLayoutClose", "", "onLayoutShown", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class UIMailLayout extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;
    public FamiliesMainLayoutBinding binding;

    @NotNull
    public final GUIFamilySystem mainRoot;

    @NotNull
    public final TimeChecker timeChecker;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIMailLayout(@NotNull GUIFamilySystem mainRoot, @Nullable ActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.actionsWithJSON = actionsWithJSON;
        this.timeChecker = new TimeChecker();
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesMainLayoutBinding familiesMainLayoutBinding = this.binding;
        if (familiesMainLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMainLayoutBinding = null;
        }
        NestedScrollView root = familiesMainLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesMainLayoutBinding familiesMainLayoutBindingInflate = FamiliesMainLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesMainLayoutBindingInflate, "inflate(...)");
        this.binding = familiesMainLayoutBindingInflate;
        FamiliesMainLayoutBinding familiesMainLayoutBinding = null;
        if (familiesMainLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMainLayoutBindingInflate = null;
        }
        final Animation animationLoadAnimation = AnimationUtils.loadAnimation(familiesMainLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        FamiliesMainLayoutBinding familiesMainLayoutBinding2 = this.binding;
        if (familiesMainLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesMainLayoutBinding2 = null;
        }
        familiesMainLayoutBinding2.familyItem1.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMailLayout.onCreateView$lambda$5$lambda$0(this.f$0, animationLoadAnimation, view);
            }
        });
        familiesMainLayoutBinding2.familyItem2.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMailLayout.onCreateView$lambda$5$lambda$1(this.f$0, animationLoadAnimation, view);
            }
        });
        familiesMainLayoutBinding2.familyItem3.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMailLayout.onCreateView$lambda$5$lambda$2(this.f$0, animationLoadAnimation, view);
            }
        });
        familiesMainLayoutBinding2.familyItem4.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMailLayout.onCreateView$lambda$5$lambda$3(this.f$0, animationLoadAnimation, view);
            }
        });
        familiesMainLayoutBinding2.familyItem5.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UIMailLayout.onCreateView$lambda$5$lambda$4(this.f$0, animationLoadAnimation, view);
            }
        });
        FamiliesMainLayoutBinding familiesMainLayoutBinding3 = this.binding;
        if (familiesMainLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesMainLayoutBinding = familiesMainLayoutBinding3;
        }
        NestedScrollView root = familiesMainLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void onCreateView$lambda$5$lambda$0(final UIMailLayout this$0, Animation animation, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            Intrinsics.checkNotNull(animation);
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$onCreateView$1$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.mainRoot.listenerLayout(4);
                }
            });
            view.startAnimation(animation);
        }
    }

    public static final void onCreateView$lambda$5$lambda$1(final UIMailLayout this$0, Animation animation, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            Intrinsics.checkNotNull(animation);
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$onCreateView$1$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws JSONException {
                    ActionsWithJSON actionsWithJSON = this.this$0.actionsWithJSON;
                    if (actionsWithJSON != null) {
                        actionsWithJSON.sendGetLayout(2);
                    }
                    this.this$0.mainRoot.setIfFromMainMenuForCarPark(true);
                }
            });
            view.startAnimation(animation);
        }
    }

    public static final void onCreateView$lambda$5$lambda$2(final UIMailLayout this$0, Animation animation, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            Intrinsics.checkNotNull(animation);
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$onCreateView$1$3$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.mainRoot.listenerLayout(3);
                }
            });
            view.startAnimation(animation);
        }
    }

    public static final void onCreateView$lambda$5$lambda$3(final UIMailLayout this$0, Animation animation, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            Intrinsics.checkNotNull(animation);
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$onCreateView$1$4$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws JSONException {
                    ActionsWithJSON actionsWithJSON = this.this$0.actionsWithJSON;
                    if (actionsWithJSON != null) {
                        actionsWithJSON.sendGetLayout(4);
                    }
                    this.this$0.mainRoot.setIfFromMainMenuForUpgrade(true);
                }
            });
            view.startAnimation(animation);
        }
    }

    public static final void onCreateView$lambda$5$lambda$4(final UIMailLayout this$0, Animation animation, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            Intrinsics.checkNotNull(animation);
            AnyExtensionKt.setActionOnAnimationEnd(animation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIMailLayout$onCreateView$1$5$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws JSONException {
                    ActionsWithJSON actionsWithJSON = this.this$0.actionsWithJSON;
                    if (actionsWithJSON != null) {
                        actionsWithJSON.sendGetLayout(7);
                    }
                }
            });
            view.startAnimation(animation);
        }
    }
}
