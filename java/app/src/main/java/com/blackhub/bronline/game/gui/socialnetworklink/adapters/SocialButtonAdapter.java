package com.blackhub.bronline.game.gui.socialnetworklink.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.SocialNetworkLinkButtonBinding;
import com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter;
import com.blackhub.bronline.game.gui.socialnetworklink.data.SocialButtonObj;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SocialButtonAdapter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SocialButtonAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public List<SocialButtonObj> allButtons = CollectionsKt__CollectionsKt.emptyList();
    public Function2<? super Integer, ? super View, Unit> onButtonClickListener;

    @NotNull
    public final Function2<Integer, View, Unit> getOnButtonClickListener() {
        Function2 function2 = this.onButtonClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onButtonClickListener");
        return null;
    }

    public final void setOnButtonClickListener(@NotNull Function2<? super Integer, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onButtonClickListener = function2;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initButtons(@NotNull List<SocialButtonObj> allButtons) {
        Intrinsics.checkNotNullParameter(allButtons, "allButtons");
        if (this.allButtons.size() != allButtons.size()) {
            this.allButtons = allButtons;
            notifyDataSetChanged();
        }
    }

    /* compiled from: SocialButtonAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/adapters/SocialButtonAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/SocialNetworkLinkButtonBinding;", "(Lcom/blackhub/bronline/game/gui/socialnetworklink/adapters/SocialButtonAdapter;Lcom/blackhub/bronline/databinding/SocialNetworkLinkButtonBinding;)V", "bind", "", "buttonItem", "Lcom/blackhub/bronline/game/gui/socialnetworklink/data/SocialButtonObj;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final SocialNetworkLinkButtonBinding binding;
        public final /* synthetic */ SocialButtonAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull SocialButtonAdapter socialButtonAdapter, SocialNetworkLinkButtonBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = socialButtonAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull final SocialButtonObj buttonItem) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(buttonItem, "buttonItem");
            SocialNetworkLinkButtonBinding socialNetworkLinkButtonBinding = this.binding;
            final SocialButtonAdapter socialButtonAdapter = this.this$0;
            Context context = socialNetworkLinkButtonBinding.getRoot().getContext();
            AnimationUtils.loadAnimation(context, R.anim.button_click);
            if (buttonItem.isActive() == 1) {
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonBorder.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_rectangle_transparent_cr5_t1_blue));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonAura.setVisibility(0);
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonName.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_rectangle_red_transparent_hgr));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonIcon.setBackground(AppCompatResources.getDrawable(context, buttonItem.getButtonResIdIfActive()));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonName.setTextColor(ContextCompat.getColor(context, R.color.white));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonBgColorNotActive.setVisibility(4);
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonBgStyleNotActive.setVisibility(4);
            } else {
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonBorder.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_rectangle_transparent_cr5_t1_gray));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonAura.setVisibility(4);
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonName.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_rectangle_gray_hgr));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonIcon.setBackground(AppCompatResources.getDrawable(context, buttonItem.getButtonResIdIfNotActive()));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonName.setTextColor(ContextCompat.getColor(context, R.color.dark_gray));
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonBgColorNotActive.setVisibility(0);
                socialNetworkLinkButtonBinding.socialNetworkLinkButtonBgStyleNotActive.setVisibility(0);
            }
            socialNetworkLinkButtonBinding.socialNetworkLinkButtonName.setText(buttonItem.getButtonName());
            socialNetworkLinkButtonBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialnetworklink.adapters.SocialButtonAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SocialButtonAdapter.ViewHolder.bind$lambda$1$lambda$0(buttonItem, socialButtonAdapter, view);
                }
            });
        }

        public static final void bind$lambda$1$lambda$0(SocialButtonObj buttonItem, SocialButtonAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(buttonItem, "$buttonItem");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (buttonItem.isActive() == 1) {
                Function2<Integer, View, Unit> onButtonClickListener = this$0.getOnButtonClickListener();
                Integer numValueOf = Integer.valueOf(buttonItem.getButtonId());
                Intrinsics.checkNotNull(view);
                onButtonClickListener.invoke(numValueOf, view);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SocialNetworkLinkButtonBinding socialNetworkLinkButtonBindingInflate = SocialNetworkLinkButtonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(socialNetworkLinkButtonBindingInflate, "inflate(...)");
        return new ViewHolder(this, socialNetworkLinkButtonBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.allButtons.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        return this.allButtons.size();
    }
}

