package com.blackhub.bronline.game.gui.familysystem.adapters;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesPlayersActionItemBinding;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersActionAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyPlayersAction;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyPlayersActionAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FamilyPlayersActionAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @Nullable
    public final Function2<FamilyPlayersAction, Integer, Unit> clickActionsButton;

    @NotNull
    public final List<FamilyPlayersAction> playersAction;

    /* JADX WARN: Multi-variable type inference failed */
    public FamilyPlayersActionAdapter(@NotNull List<FamilyPlayersAction> playersAction, @Nullable Function2<? super FamilyPlayersAction, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(playersAction, "playersAction");
        this.playersAction = playersAction;
        this.clickActionsButton = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FamiliesPlayersActionItemBinding familiesPlayersActionItemBindingInflate = FamiliesPlayersActionItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(familiesPlayersActionItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, familiesPlayersActionItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.playersAction.get(position), this.clickActionsButton);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.playersAction.size();
    }

    /* compiled from: FamilyPlayersActionAdapter.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2>\u0010\t\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nj\u0004\u0018\u0001`\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyPlayersActionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/FamiliesPlayersActionItemBinding;", "(Lcom/blackhub/bronline/game/gui/familysystem/adapters/FamilyPlayersActionAdapter;Lcom/blackhub/bronline/databinding/FamiliesPlayersActionItemBinding;)V", "bind", "", "action", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilyPlayersAction;", "clickActionsButton", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thisAction", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickActionsButton;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final FamiliesPlayersActionItemBinding binding;
        public final /* synthetic */ FamilyPlayersActionAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FamilyPlayersActionAdapter familyPlayersActionAdapter, FamiliesPlayersActionItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = familyPlayersActionAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final FamilyPlayersAction action, @Nullable final Function2<? super FamilyPlayersAction, ? super Integer, Unit> clickActionsButton) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(action, "action");
            final Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.binding.getRoot().getContext(), R.anim.button_click);
            FamiliesPlayersActionItemBinding familiesPlayersActionItemBinding = this.binding;
            familiesPlayersActionItemBinding.actionsTitle.setText(action.getActionsTitle());
            int type = action.getType();
            if (type == 0) {
                familiesPlayersActionItemBinding.buttonPlusAction.setVisibility(0);
                familiesPlayersActionItemBinding.actionsValue.setVisibility(0);
                familiesPlayersActionItemBinding.buttonMinusAction.setVisibility(0);
                if (action.getActionsId() == 2) {
                    familiesPlayersActionItemBinding.actionsValue.setText(String.valueOf(action.getActionsValue() / 60));
                } else {
                    familiesPlayersActionItemBinding.actionsValue.setText(String.valueOf(action.getActionsValue()));
                }
                familiesPlayersActionItemBinding.buttonKick.setVisibility(8);
            } else if (type == 1) {
                familiesPlayersActionItemBinding.buttonPlusAction.setVisibility(4);
                familiesPlayersActionItemBinding.actionsValue.setVisibility(4);
                familiesPlayersActionItemBinding.buttonMinusAction.setVisibility(4);
                familiesPlayersActionItemBinding.buttonKick.setVisibility(0);
            } else {
                familiesPlayersActionItemBinding.buttonPlusAction.setVisibility(4);
                familiesPlayersActionItemBinding.actionsValue.setVisibility(4);
                familiesPlayersActionItemBinding.buttonMinusAction.setVisibility(4);
                familiesPlayersActionItemBinding.buttonKick.setVisibility(8);
                familiesPlayersActionItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersActionAdapter$ViewHolder$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FamilyPlayersActionAdapter.ViewHolder.bind$lambda$4$lambda$0(animationLoadAnimation, clickActionsButton, action, view);
                    }
                });
            }
            familiesPlayersActionItemBinding.buttonPlusAction.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersActionAdapter$ViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FamilyPlayersActionAdapter.ViewHolder.bind$lambda$4$lambda$1(animationLoadAnimation, clickActionsButton, action, view);
                }
            });
            familiesPlayersActionItemBinding.buttonMinusAction.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersActionAdapter$ViewHolder$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FamilyPlayersActionAdapter.ViewHolder.bind$lambda$4$lambda$2(animationLoadAnimation, clickActionsButton, action, view);
                }
            });
            familiesPlayersActionItemBinding.buttonKick.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.adapters.FamilyPlayersActionAdapter$ViewHolder$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FamilyPlayersActionAdapter.ViewHolder.bind$lambda$4$lambda$3(animationLoadAnimation, clickActionsButton, action, view);
                }
            });
        }

        public static final void bind$lambda$4$lambda$0(Animation animation, Function2 function2, FamilyPlayersAction action, View view) {
            Intrinsics.checkNotNullParameter(action, "$action");
            view.startAnimation(animation);
            if (function2 != null) {
                function2.invoke(action, 3);
            }
        }

        public static final void bind$lambda$4$lambda$1(Animation animation, Function2 function2, FamilyPlayersAction action, View view) {
            Intrinsics.checkNotNullParameter(action, "$action");
            view.startAnimation(animation);
            if (function2 != null) {
                function2.invoke(action, 1);
            }
        }

        public static final void bind$lambda$4$lambda$2(Animation animation, Function2 function2, FamilyPlayersAction action, View view) {
            Intrinsics.checkNotNullParameter(action, "$action");
            view.startAnimation(animation);
            if (function2 != null) {
                function2.invoke(action, 0);
            }
        }

        public static final void bind$lambda$4$lambda$3(Animation animation, Function2 function2, FamilyPlayersAction action, View view) {
            Intrinsics.checkNotNullParameter(action, "$action");
            view.startAnimation(animation);
            if (function2 != null) {
                function2.invoke(action, 2);
            }
        }
    }
}

