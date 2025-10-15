package com.blackhub.bronline.game.gui.inventory.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.InventoryButtonItemBinding;
import com.blackhub.bronline.game.gui.inventory.adapters.MainButtonsAdapter;
import com.blackhub.bronline.game.gui.inventory.data.InvMainButtonsData;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainButtonsAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bBS\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012>\u0010\u0006\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010\u0006\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007j\u0004\u0018\u0001`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/MainButtonsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/inventory/adapters/MainButtonsAdapter$ViewHolder;", "buttonsList", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMainButtonsData;", "mainButtonsClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "mainButton", "Landroid/view/View;", SVG.View.NODE_NAME, "", "Lcom/blackhub/bronline/game/gui/inventory/OnMainButtonsClickListener;", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "binding", "Lcom/blackhub/bronline/databinding/InventoryButtonItemBinding;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class MainButtonsAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;
    public InventoryButtonItemBinding binding;

    @NotNull
    public final List<InvMainButtonsData> buttonsList;

    @Nullable
    public final Function2<InvMainButtonsData, View, Unit> mainButtonsClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public MainButtonsAdapter(@NotNull List<InvMainButtonsData> buttonsList, @Nullable Function2<? super InvMainButtonsData, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(buttonsList, "buttonsList");
        this.buttonsList = buttonsList;
        this.mainButtonsClickListener = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        InventoryButtonItemBinding inventoryButtonItemBindingInflate = InventoryButtonItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inventoryButtonItemBindingInflate, "inflate(...)");
        this.binding = inventoryButtonItemBindingInflate;
        InventoryButtonItemBinding inventoryButtonItemBinding = this.binding;
        if (inventoryButtonItemBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inventoryButtonItemBinding = null;
        }
        return new ViewHolder(this, inventoryButtonItemBinding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.buttonsList.get(position), this.mainButtonsClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.buttonsList.size();
    }

    /* compiled from: MainButtonsAdapter.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JN\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2>\u0010\t\u001a:\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nj\u0004\u0018\u0001`\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/adapters/MainButtonsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/InventoryButtonItemBinding;", "(Lcom/blackhub/bronline/game/gui/inventory/adapters/MainButtonsAdapter;Lcom/blackhub/bronline/databinding/InventoryButtonItemBinding;)V", "bind", "", "mainButton", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMainButtonsData;", "mainButtonsClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroid/view/View;", SVG.View.NODE_NAME, "Lcom/blackhub/bronline/game/gui/inventory/OnMainButtonsClickListener;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final InventoryButtonItemBinding binding;
        public final /* synthetic */ MainButtonsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull MainButtonsAdapter mainButtonsAdapter, InventoryButtonItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = mainButtonsAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final InvMainButtonsData mainButton, @Nullable final Function2<? super InvMainButtonsData, ? super View, Unit> mainButtonsClickListener) {
            Intrinsics.checkNotNullParameter(mainButton, "mainButton");
            this.binding.invTitleButton.setText(mainButton.getNameButton());
            this.binding.invIconButtonItem.setImageResource(mainButton.getIconsRes());
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.inventory.adapters.MainButtonsAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainButtonsAdapter.ViewHolder.bind$lambda$0(mainButtonsClickListener, mainButton, view);
                }
            });
        }

        public static final void bind$lambda$0(Function2 function2, InvMainButtonsData mainButton, View view) {
            Intrinsics.checkNotNullParameter(mainButton, "$mainButton");
            if (function2 != null) {
                Intrinsics.checkNotNull(view);
                function2.invoke(mainButton, view);
            }
        }
    }
}
