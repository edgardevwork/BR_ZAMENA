package com.blackhub.bronline.game.gui.entertainmentsystem.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.EntertainmentSystemTopItemBinding;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData;
import com.bless.client.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EntertainmentSystemPlayersTopAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\"H\u0016J\u0016\u0010&\u001a\u00020'2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0007J\u001c\u0010(\u001a\u00020'2\n\u0010)\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\"H\u0016J\u001c\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0013\u0010\tR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0016\u0010\tR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0019\u0010\tR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001c\u0010\tR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemPlayersTopAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemPlayersTopAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "iconArmsBattle", "Landroid/graphics/drawable/Drawable;", "getIconArmsBattle", "()Landroid/graphics/drawable/Drawable;", "iconArmsBattle$delegate", "Lkotlin/Lazy;", "iconBattleground", "getIconBattleground", "iconBattleground$delegate", "iconDefault", "getIconDefault", "iconDefault$delegate", "iconFlatout", "getIconFlatout", "iconFlatout$delegate", "iconRice", "getIconRice", "iconRice$delegate", "iconRubilovo", "getIconRubilovo", "iconRubilovo$delegate", "iconTankBattles", "getIconTankBattles", "iconTankBattles$delegate", "playersList", "", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentPlayersData;", "getItemCount", "", "getItemId", "", "position", "initTopPlayers", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class EntertainmentSystemPlayersTopAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    @NotNull
    public final Context context;

    /* renamed from: iconArmsBattle$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy iconArmsBattle;

    /* renamed from: iconBattleground$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy iconBattleground;

    /* renamed from: iconDefault$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy iconDefault;

    /* renamed from: iconFlatout$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy iconFlatout;

    /* renamed from: iconRice$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy iconRice;

    /* renamed from: iconRubilovo$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy iconRubilovo;

    /* renamed from: iconTankBattles$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy iconTankBattles;

    @NotNull
    public List<EntertainmentPlayersData> playersList;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    public EntertainmentSystemPlayersTopAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.playersList = CollectionsKt__CollectionsKt.emptyList();
        this.iconBattleground = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter$iconBattleground$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.img_battleground, null);
            }
        });
        this.iconRubilovo = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter$iconRubilovo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.img_rubilovo, null);
            }
        });
        this.iconFlatout = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter$iconFlatout$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.img_flatout, null);
            }
        });
        this.iconTankBattles = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter$iconTankBattles$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.img_tank, null);
            }
        });
        this.iconArmsBattle = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter$iconArmsBattle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.img_guns, null);
            }
        });
        this.iconRice = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter$iconRice$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.img_rice, null);
            }
        });
        this.iconDefault = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemPlayersTopAdapter$iconDefault$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return ResourcesCompat.getDrawable(this.this$0.context.getResources(), R.drawable.img_logo_br_small, null);
            }
        });
    }

    public final Drawable getIconBattleground() {
        return (Drawable) this.iconBattleground.getValue();
    }

    public final Drawable getIconRubilovo() {
        return (Drawable) this.iconRubilovo.getValue();
    }

    public final Drawable getIconFlatout() {
        return (Drawable) this.iconFlatout.getValue();
    }

    public final Drawable getIconTankBattles() {
        return (Drawable) this.iconTankBattles.getValue();
    }

    public final Drawable getIconArmsBattle() {
        return (Drawable) this.iconArmsBattle.getValue();
    }

    public final Drawable getIconRice() {
        return (Drawable) this.iconRice.getValue();
    }

    public final Drawable getIconDefault() {
        return (Drawable) this.iconDefault.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void initTopPlayers(@NotNull List<EntertainmentPlayersData> playersList) {
        Intrinsics.checkNotNullParameter(playersList, "playersList");
        this.playersList = playersList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        EntertainmentSystemTopItemBinding entertainmentSystemTopItemBindingInflate = EntertainmentSystemTopItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(entertainmentSystemTopItemBindingInflate, "inflate(...)");
        return new ViewHolder(this, entertainmentSystemTopItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.playersList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.playersList.size();
    }

    /* compiled from: EntertainmentSystemPlayersTopAdapter.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemPlayersTopAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/blackhub/bronline/databinding/EntertainmentSystemTopItemBinding;", "(Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemPlayersTopAdapter;Lcom/blackhub/bronline/databinding/EntertainmentSystemTopItemBinding;)V", "bind", "", "player", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentPlayersData;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        public final EntertainmentSystemTopItemBinding binding;
        public final /* synthetic */ EntertainmentSystemPlayersTopAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull EntertainmentSystemPlayersTopAdapter entertainmentSystemPlayersTopAdapter, EntertainmentSystemTopItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = entertainmentSystemPlayersTopAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull EntertainmentPlayersData player) {
            Intrinsics.checkNotNullParameter(player, "player");
            EntertainmentSystemTopItemBinding entertainmentSystemTopItemBinding = this.binding;
            EntertainmentSystemPlayersTopAdapter entertainmentSystemPlayersTopAdapter = this.this$0;
            entertainmentSystemTopItemBinding.topPosition.setText(String.valueOf(player.getPosition()));
            entertainmentSystemTopItemBinding.playersNick.setText(player.getPlayersNick());
            entertainmentSystemTopItemBinding.playersGames.setText(player.getAllGames());
            ImageView imageView = entertainmentSystemTopItemBinding.gameIcon;
            int thisGame = player.getThisGame();
            imageView.setImageDrawable(thisGame != 0 ? thisGame != 1 ? thisGame != 2 ? thisGame != 3 ? thisGame != 4 ? thisGame != 5 ? entertainmentSystemPlayersTopAdapter.getIconDefault() : entertainmentSystemPlayersTopAdapter.getIconRice() : entertainmentSystemPlayersTopAdapter.getIconArmsBattle() : entertainmentSystemPlayersTopAdapter.getIconTankBattles() : entertainmentSystemPlayersTopAdapter.getIconFlatout() : entertainmentSystemPlayersTopAdapter.getIconRubilovo() : entertainmentSystemPlayersTopAdapter.getIconBattleground());
            entertainmentSystemTopItemBinding.leftIcon.setImageResource(player.getLeftIcon());
            entertainmentSystemTopItemBinding.rightIcon.setImageResource(player.getRightIcon());
        }
    }
}
