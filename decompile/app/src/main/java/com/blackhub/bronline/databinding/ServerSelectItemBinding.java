package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.roundcornerprogressbar.RoundCornerProgressBar;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class ServerSelectItemBinding implements ViewBinding {

    @NonNull
    public final ImageView brServerImage;

    @NonNull
    public final TextView brServerName;

    @NonNull
    public final TextView brServerOnline;

    @NonNull
    public final RoundCornerProgressBar brServerProgress;

    @NonNull
    public final TextView brServerX2;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    public final View serverListBackColor;

    public ServerSelectItemBinding(@NonNull FrameLayout rootView, @NonNull ImageView brServerImage, @NonNull TextView brServerName, @NonNull TextView brServerOnline, @NonNull RoundCornerProgressBar brServerProgress, @NonNull TextView brServerX2, @NonNull View serverListBackColor) {
        this.rootView = rootView;
        this.brServerImage = brServerImage;
        this.brServerName = brServerName;
        this.brServerOnline = brServerOnline;
        this.brServerProgress = brServerProgress;
        this.brServerX2 = brServerX2;
        this.serverListBackColor = serverListBackColor;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ServerSelectItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ServerSelectItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.server_select_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static ServerSelectItemBinding bind(@NonNull View rootView) {
        int i = R.id.br_server_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.br_server_image);
        if (imageView != null) {
            i = R.id.br_server_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.br_server_name);
            if (textView != null) {
                i = R.id.br_server_online;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.br_server_online);
                if (textView2 != null) {
                    i = R.id.br_server_progress;
                    RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) ViewBindings.findChildViewById(rootView, R.id.br_server_progress);
                    if (roundCornerProgressBar != null) {
                        i = R.id.br_server_x2;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.br_server_x2);
                        if (textView3 != null) {
                            i = R.id.server_list_back_color;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.server_list_back_color);
                            if (viewFindChildViewById != null) {
                                return new ServerSelectItemBinding((FrameLayout) rootView, imageView, textView, textView2, roundCornerProgressBar, textView3, viewFindChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
