package com.blackhub.bronline.game.gui.menupausesettingandmap.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.NewMenuPauseActionButtonItemBinding;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuPauseButtonAdapter;
import com.blackhub.bronline.game.gui.menupausesettingandmap.data.MenuPauseButtonObj;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MenuPauseButtonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\tH\u0016J\u001c\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016R5\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuPauseButtonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuPauseButtonAdapter$ViewHolder;", "buttonsList", "", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/data/MenuPauseButtonObj;", "(Ljava/util/List;)V", "buttonClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "buttonId", "", "getButtonClickListener", "()Lkotlin/jvm/functions/Function1;", "setButtonClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class MenuPauseButtonAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function1<? super Integer, Unit> buttonClickListener;

    @NotNull
    public final List<MenuPauseButtonObj> buttonsList;

    public MenuPauseButtonAdapter(@NotNull List<MenuPauseButtonObj> buttonsList) {
        Intrinsics.checkNotNullParameter(buttonsList, "buttonsList");
        this.buttonsList = buttonsList;
    }

    @NotNull
    public final Function1<Integer, Unit> getButtonClickListener() {
        Function1 function1 = this.buttonClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("buttonClickListener");
        return null;
    }

    public final void setButtonClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.buttonClickListener = function1;
    }

    /* compiled from: MenuPauseButtonAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuPauseButtonAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/NewMenuPauseActionButtonItemBinding;", "(Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuPauseButtonAdapter;Lcom/blackhub/bronline/databinding/NewMenuPauseActionButtonItemBinding;)V", "bind", "", "item", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/data/MenuPauseButtonObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final NewMenuPauseActionButtonItemBinding binding;
        public final /* synthetic */ MenuPauseButtonAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull MenuPauseButtonAdapter menuPauseButtonAdapter, NewMenuPauseActionButtonItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = menuPauseButtonAdapter;
            this.binding = binding;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final void bind(@NotNull final MenuPauseButtonObj item) {
            Intrinsics.checkNotNullParameter(item, "item");
            final NewMenuPauseActionButtonItemBinding newMenuPauseActionButtonItemBinding = this.binding;
            final MenuPauseButtonAdapter menuPauseButtonAdapter = this.this$0;
            newMenuPauseActionButtonItemBinding.newMenuPauseActionButtonsAura.setBackground(AppCompatResources.getDrawable(newMenuPauseActionButtonItemBinding.getRoot().getContext(), R.drawable.bg_new_menu_pause_action_button_aura_inactive));
            newMenuPauseActionButtonItemBinding.newMenuPauseActionButtonsIcon.setImageResource(item.getButtonIconRes());
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (bindingAdapterPosition != 0) {
                if (bindingAdapterPosition == menuPauseButtonAdapter.buttonsList.size() - 1) {
                    newMenuPauseActionButtonItemBinding.getRoot().setBackground(AppCompatResources.getDrawable(newMenuPauseActionButtonItemBinding.getRoot().getContext(), R.drawable.bg_rectangle_gray_vgr_crb4));
                }
            } else {
                newMenuPauseActionButtonItemBinding.getRoot().setBackground(AppCompatResources.getDrawable(newMenuPauseActionButtonItemBinding.getRoot().getContext(), R.drawable.bg_new_menu_pause_action_top_button));
            }
            newMenuPauseActionButtonItemBinding.getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuPauseButtonAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return MenuPauseButtonAdapter.ViewHolder.bind$lambda$1$lambda$0(newMenuPauseActionButtonItemBinding, menuPauseButtonAdapter, item, view, motionEvent);
                }
            });
            newMenuPauseActionButtonItemBinding.newMenuPauseActionButtonsText.setText(item.getButtonName());
        }

        public static final boolean bind$lambda$1$lambda$0(NewMenuPauseActionButtonItemBinding this_with, MenuPauseButtonAdapter this$0, MenuPauseButtonObj item, View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            int action = motionEvent.getAction();
            if (action == 0) {
                this_with.newMenuPauseActionButtonsAura.setBackground(AppCompatResources.getDrawable(this_with.getRoot().getContext(), R.drawable.bg_new_menu_pause_action_button_aura_active));
            } else if (action == 1) {
                this_with.newMenuPauseActionButtonsAura.setBackground(AppCompatResources.getDrawable(this_with.getRoot().getContext(), R.drawable.bg_new_menu_pause_action_button_aura_inactive));
                this$0.getButtonClickListener().invoke(Integer.valueOf(item.getButtonId()));
            } else if (action == 3) {
                this_with.newMenuPauseActionButtonsAura.setBackground(AppCompatResources.getDrawable(this_with.getRoot().getContext(), R.drawable.bg_new_menu_pause_action_button_aura_inactive));
            }
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        NewMenuPauseActionButtonItemBinding newMenuPauseActionButtonItemBindingInflate = NewMenuPauseActionButtonItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(newMenuPauseActionButtonItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, newMenuPauseActionButtonItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.buttonsList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.buttonsList.size();
    }
}
