package com.blackhub.bronline.game.gui.drivingschool.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DrivingSchoolRadialMenuInfoItemBinding;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.drivingschool.data.SignObj;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrivingSchoolRadialMenuInfoAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolRadialMenuInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolRadialMenuInfoAdapter$ViewHolder;", "radialMenuList", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/SignObj;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DrivingSchoolRadialMenuInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Context context;

    @NotNull
    public final List<SignObj> radialMenuList;

    public DrivingSchoolRadialMenuInfoAdapter(@NotNull List<SignObj> radialMenuList, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(radialMenuList, "radialMenuList");
        Intrinsics.checkNotNullParameter(context, "context");
        this.radialMenuList = radialMenuList;
        this.context = context;
    }

    /* compiled from: DrivingSchoolRadialMenuInfoAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolRadialMenuInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/DrivingSchoolRadialMenuInfoItemBinding;", "(Lcom/blackhub/bronline/game/gui/drivingschool/adapters/DrivingSchoolRadialMenuInfoAdapter;Lcom/blackhub/bronline/databinding/DrivingSchoolRadialMenuInfoItemBinding;)V", "bind", "", "radialMenuItem", "Lcom/blackhub/bronline/game/gui/drivingschool/data/SignObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final DrivingSchoolRadialMenuInfoItemBinding binding;
        public final /* synthetic */ DrivingSchoolRadialMenuInfoAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull DrivingSchoolRadialMenuInfoAdapter drivingSchoolRadialMenuInfoAdapter, DrivingSchoolRadialMenuInfoItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = drivingSchoolRadialMenuInfoAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull SignObj radialMenuItem) {
            Intrinsics.checkNotNullParameter(radialMenuItem, "radialMenuItem");
            DrivingSchoolRadialMenuInfoItemBinding drivingSchoolRadialMenuInfoItemBinding = this.binding;
            DrivingSchoolRadialMenuInfoAdapter drivingSchoolRadialMenuInfoAdapter = this.this$0;
            drivingSchoolRadialMenuInfoItemBinding.iconLeftAction.setImageResource(radialMenuItem.getLeftSignIcon());
            TextView textView = drivingSchoolRadialMenuInfoItemBinding.titleLeftAction;
            Useful useful = Useful.INSTANCE;
            String string = drivingSchoolRadialMenuInfoAdapter.context.getString(radialMenuItem.getLeftSignName());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            textView.setText(useful.getTextWithHtmlStyles(string));
            drivingSchoolRadialMenuInfoItemBinding.textLeftAction.setText(drivingSchoolRadialMenuInfoAdapter.context.getString(radialMenuItem.getLeftSignDescription()));
            Integer leftPosition = radialMenuItem.getLeftPosition();
            if (leftPosition != null) {
                drivingSchoolRadialMenuInfoItemBinding.numberLeftAction.setText(String.valueOf(leftPosition.intValue()));
            }
            if (radialMenuItem.getRightSignIcon() != null && radialMenuItem.getRightSignName() != null && radialMenuItem.getRightSignDescription() != null) {
                drivingSchoolRadialMenuInfoItemBinding.iconRightAction.setImageResource(radialMenuItem.getRightSignIcon().intValue());
                TextView textView2 = drivingSchoolRadialMenuInfoItemBinding.titleRightAction;
                String string2 = drivingSchoolRadialMenuInfoAdapter.context.getString(radialMenuItem.getRightSignName().intValue());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                textView2.setText(useful.getTextWithHtmlStyles(string2));
                drivingSchoolRadialMenuInfoItemBinding.textRightAction.setText(drivingSchoolRadialMenuInfoAdapter.context.getString(radialMenuItem.getRightSignDescription().intValue()));
                Integer rightPosition = radialMenuItem.getRightPosition();
                if (rightPosition != null) {
                    drivingSchoolRadialMenuInfoItemBinding.numberRightAction.setText(String.valueOf(rightPosition.intValue()));
                }
            }
            if (radialMenuItem.getIfShowUnderline()) {
                drivingSchoolRadialMenuInfoItemBinding.dividerHorizontalUnderline.setVisibility(0);
            } else {
                drivingSchoolRadialMenuInfoItemBinding.dividerHorizontalUnderline.setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DrivingSchoolRadialMenuInfoItemBinding drivingSchoolRadialMenuInfoItemBindingInflate = DrivingSchoolRadialMenuInfoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(drivingSchoolRadialMenuInfoItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, drivingSchoolRadialMenuInfoItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.radialMenuList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.radialMenuList.size();
    }
}
