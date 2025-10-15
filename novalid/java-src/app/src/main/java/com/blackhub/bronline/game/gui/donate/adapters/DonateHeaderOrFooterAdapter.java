package com.blackhub.bronline.game.gui.donate.adapters;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DonateTopOrBottomButtonItemBinding;
import com.blackhub.bronline.game.gui.donate.adapters.DonateHeaderOrFooterAdapter;
import com.blackhub.bronline.game.gui.donate.data.HeaderOrFooterButtonObj;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DonateHeaderOrFooterAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0006\u0010\u001c\u001a\u00020\nJ\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u001e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J\u0006\u0010\u001f\u001a\u00020\nJ\u001c\u0010 \u001a\u00020\n2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u0006\u0010'\u001a\u00020\nJ\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0006H\u0002J\u0006\u0010*\u001a\u00020\nJ\u0006\u0010+\u001a\u00020\nJ\u000e\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0006J\u0018\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0013H\u0002R5\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R5\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateHeaderOrFooterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/donate/adapters/DonateHeaderOrFooterAdapter$ViewHolder;", "()V", "buttonClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "newButtonPos", "", "getButtonClickListener", "()Lkotlin/jvm/functions/Function1;", "setButtonClickListener", "(Lkotlin/jvm/functions/Function1;)V", "currentItems", "", "Lcom/blackhub/bronline/game/gui/donate/data/HeaderOrFooterButtonObj;", "ifHeader", "", "layoutOrPageClickListener", "newButtonId", "getLayoutOrPageClickListener", "setLayoutOrPageClickListener", "newPosOfPage", "oldClickedPosOfPage", "changeListener", "posItem", "deselectTab", "getItemCount", "initItemsList", "nextTab", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "previousTab", "saveOldPos", "currentPos", "setBPTab", "setFirstTab", "setNewTab", "newPage", "setValueOfSelectForCurrentItem", "isSelect", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DonateHeaderOrFooterAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public Function1<? super Integer, Unit> buttonClickListener;

    @NotNull
    public List<HeaderOrFooterButtonObj> currentItems = CollectionsKt__CollectionsKt.emptyList();
    public boolean ifHeader;
    public Function1<? super Integer, Unit> layoutOrPageClickListener;
    public int newPosOfPage;
    public int oldClickedPosOfPage;

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

    @NotNull
    public final Function1<Integer, Unit> getLayoutOrPageClickListener() {
        Function1 function1 = this.layoutOrPageClickListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutOrPageClickListener");
        return null;
    }

    public final void setLayoutOrPageClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.layoutOrPageClickListener = function1;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initItemsList(boolean ifHeader, @NotNull List<HeaderOrFooterButtonObj> currentItems) {
        Intrinsics.checkNotNullParameter(currentItems, "currentItems");
        this.ifHeader = ifHeader;
        this.currentItems = currentItems;
        notifyDataSetChanged();
    }

    /* compiled from: DonateHeaderOrFooterAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/adapters/DonateHeaderOrFooterAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DonateTopOrBottomButtonItemBinding;", "(Lcom/blackhub/bronline/game/gui/donate/adapters/DonateHeaderOrFooterAdapter;Lcom/blackhub/bronline/databinding/DonateTopOrBottomButtonItemBinding;)V", "getBinding", "()Lcom/blackhub/bronline/databinding/DonateTopOrBottomButtonItemBinding;", "bind", "", "currentObject", "Lcom/blackhub/bronline/game/gui/donate/data/HeaderOrFooterButtonObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DonateTopOrBottomButtonItemBinding binding;
        public final /* synthetic */ DonateHeaderOrFooterAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter, DonateTopOrBottomButtonItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = donateHeaderOrFooterAdapter;
            this.binding = binding;
        }

        @NotNull
        public final DonateTopOrBottomButtonItemBinding getBinding() {
            return this.binding;
        }

        public final void bind(@NotNull final HeaderOrFooterButtonObj currentObject) {
            Intrinsics.checkNotNullParameter(currentObject, "currentObject");
            Resources resources = this.binding.getRoot().getResources();
            DonateTopOrBottomButtonItemBinding donateTopOrBottomButtonItemBinding = this.binding;
            final DonateHeaderOrFooterAdapter donateHeaderOrFooterAdapter = this.this$0;
            donateTopOrBottomButtonItemBinding.buttonTitle.setText(currentObject.getTitle());
            if (currentObject.getSelected()) {
                donateTopOrBottomButtonItemBinding.buttonTitle.setTextColor(ResourcesCompat.getColor(resources, R.color.white, null));
                donateTopOrBottomButtonItemBinding.getRoot().setBackgroundColor(ResourcesCompat.getColor(resources, R.color.red, null));
            } else {
                donateTopOrBottomButtonItemBinding.buttonTitle.setTextColor(ResourcesCompat.getColor(resources, R.color.dark_gray, null));
                donateTopOrBottomButtonItemBinding.getRoot().setBackgroundColor(0);
            }
            int i = resources.getConfiguration().smallestScreenWidthDp;
            donateTopOrBottomButtonItemBinding.buttonTitle.setTextSize(2, (400 > i || i >= 500) ? (500 > i || i >= 700) ? i > 700 ? donateHeaderOrFooterAdapter.ifHeader ? 15.0f : 20.0f : donateHeaderOrFooterAdapter.ifHeader ? 9.0f : 14.0f : donateHeaderOrFooterAdapter.ifHeader ? 13.0f : 18.0f : donateHeaderOrFooterAdapter.ifHeader ? 11.0f : 16.0f);
            donateTopOrBottomButtonItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.adapters.DonateHeaderOrFooterAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DonateHeaderOrFooterAdapter.ViewHolder.bind$lambda$1$lambda$0(currentObject, donateHeaderOrFooterAdapter, this, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(HeaderOrFooterButtonObj currentObject, DonateHeaderOrFooterAdapter this$0, ViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(currentObject, "$currentObject");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (currentObject.getSelected()) {
                return;
            }
            this$0.getButtonClickListener().invoke(Integer.valueOf(this$1.getBindingAdapterPosition()));
        }
    }

    public final void setNewTab(int newPage) {
        if (newPage < 0 || newPage >= this.currentItems.size()) {
            return;
        }
        setValueOfSelectForCurrentItem(newPage, true);
        int i = this.oldClickedPosOfPage;
        if (i != -1 && i != newPage) {
            setValueOfSelectForCurrentItem(i, false);
        }
        changeListener(newPage);
        saveOldPos(newPage);
    }

    public final void setValueOfSelectForCurrentItem(int currentPos, boolean isSelect) {
        this.currentItems.get(currentPos).setSelected(isSelect);
        notifyItemChanged(currentPos);
    }

    public final void changeListener(int posItem) {
        getLayoutOrPageClickListener().invoke(Integer.valueOf(this.currentItems.get(posItem).getId()));
    }

    public final void saveOldPos(int currentPos) {
        this.oldClickedPosOfPage = currentPos;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DonateTopOrBottomButtonItemBinding donateTopOrBottomButtonItemBindingInflate = DonateTopOrBottomButtonItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(donateTopOrBottomButtonItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, donateTopOrBottomButtonItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.currentItems.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.currentItems.size();
    }

    public final void nextTab() {
        int i = this.oldClickedPosOfPage;
        if (i != -1) {
            int i2 = i + 1;
            this.newPosOfPage = i2;
            if (i2 >= this.currentItems.size()) {
                this.newPosOfPage = 0;
            }
            setNewTab(this.newPosOfPage);
        }
    }

    public final void previousTab() {
        int i = this.oldClickedPosOfPage;
        if (i != -1) {
            int i2 = i - 1;
            this.newPosOfPage = i2;
            if (i2 < 0) {
                this.newPosOfPage = CollectionsKt__CollectionsKt.getLastIndex(this.currentItems);
            }
            setNewTab(this.newPosOfPage);
        }
    }

    public final void deselectTab() {
        int i = this.oldClickedPosOfPage;
        if (i != -1) {
            setValueOfSelectForCurrentItem(i, false);
        }
        saveOldPos(-1);
    }

    public final void setFirstTab() {
        deselectTab();
        setValueOfSelectForCurrentItem(0, true);
        saveOldPos(0);
    }

    public final void setBPTab() {
        deselectTab();
        setValueOfSelectForCurrentItem(2, true);
        saveOldPos(2);
    }
}
