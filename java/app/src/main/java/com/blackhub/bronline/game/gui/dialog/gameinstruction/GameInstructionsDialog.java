package com.blackhub.bronline.game.gui.dialog.gameinstruction;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.blackhub.bronline.databinding.DialogGameInstructionsBinding;
import com.blackhub.bronline.game.common.DialogNoNavBarFullScreen;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: GameInstructionsDialog.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGameInstructionsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameInstructionsDialog.kt\ncom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes.dex */
public final class GameInstructionsDialog extends DialogNoNavBarFullScreen {

    /* renamed from: adapterGameInstructions$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapterGameInstructions;

    @NotNull
    public final DialogGameInstructionsBinding binding;

    @NotNull
    public List<GameInstructionsItem> listItem;

    @NotNull
    public Function0<Unit> resultDismissCallback;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameInstructionsDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DialogGameInstructionsBinding dialogGameInstructionsBindingInflate = DialogGameInstructionsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dialogGameInstructionsBindingInflate, "inflate(...)");
        this.binding = dialogGameInstructionsBindingInflate;
        this.listItem = CollectionsKt__CollectionsKt.emptyList();
        this.adapterGameInstructions = LazyKt__LazyJVMKt.lazy(new Function0<AdapterGameInstructions>() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$adapterGameInstructions$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AdapterGameInstructions invoke() {
                return new AdapterGameInstructions(this.this$0.listItem);
            }
        });
        this.resultDismissCallback = new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$resultDismissCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
    }

    /* compiled from: GameInstructionsDialog.kt */
    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog$Companion;", "", "()V", "create", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsDialog;", "context", "Landroid/content/Context;", "listItem", "", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "resultDismissCallback", "Lkotlin/Function0;", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GameInstructionsDialog create(@NotNull Context context, @NotNull List<GameInstructionsItem> listItem, @NotNull Function0<Unit> resultDismissCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listItem, "listItem");
            Intrinsics.checkNotNullParameter(resultDismissCallback, "resultDismissCallback");
            GameInstructionsDialog gameInstructionsDialog = new GameInstructionsDialog(context);
            gameInstructionsDialog.listItem = listItem;
            gameInstructionsDialog.resultDismissCallback = resultDismissCallback;
            return gameInstructionsDialog;
        }
    }

    public final AdapterGameInstructions getAdapterGameInstructions() {
        return (AdapterGameInstructions) this.adapterGameInstructions.getValue();
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    @NotNull
    public View getContentView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.DialogNoNavBarFullScreen
    public void initListeners() {
        int size = this.listItem.size() > 1 ? this.listItem.size() : 0;
        Activity activityScanForActivity = UtilsKt.scanForActivity(getContext());
        if (activityScanForActivity != null) {
            setOwnerActivity(activityScanForActivity);
        }
        setCancelable(true);
        final DialogGameInstructionsBinding dialogGameInstructionsBinding = this.binding;
        ViewPager2 viewPager2 = dialogGameInstructionsBinding.vpGameInstructions;
        viewPager2.setAdapter(getAdapterGameInstructions());
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$initListeners$2$1$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                dialogGameInstructionsBinding.anyViewIndicator.setCurrentPosition(position);
            }
        });
        DotViewIndicator dotViewIndicator = dialogGameInstructionsBinding.anyViewIndicator;
        dotViewIndicator.setItemCount(size);
        dotViewIndicator.setCurrentPosition(0);
        dialogGameInstructionsBinding.btnClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameInstructionsDialog.initListeners$lambda$5$lambda$3(this.f$0, view);
            }
        });
        dialogGameInstructionsBinding.imgGameHintBack.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameInstructionsDialog.initListeners$lambda$5$lambda$4(this.f$0, view);
            }
        });
    }

    public static final void initListeners$lambda$5$lambda$3(final GameInstructionsDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getTimeChecker().ifAccess(250L)) {
            AnyExtensionKt.setActionOnAnimationEnd(this$0.getAnim(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsDialog$initListeners$2$3$1
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
                    this.this$0.resultDismissCallback.invoke();
                    this.this$0.dismiss();
                }
            });
            view.startAnimation(this$0.getAnim());
        }
    }

    public static final void initListeners$lambda$5$lambda$4(GameInstructionsDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resultDismissCallback.invoke();
        this$0.dismiss();
    }
}

