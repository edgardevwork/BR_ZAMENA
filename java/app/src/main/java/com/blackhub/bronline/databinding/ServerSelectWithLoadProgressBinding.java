package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.blackhub.bronline.game.common.roundcornerprogressbar.RoundCornerProgressBar;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class ServerSelectWithLoadProgressBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton allServersButton;

    @NonNull
    public final TextView brLsProgress;

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
    public final AppCompatButton brServersPlay;

    @NonNull
    public final LinearLayout chooseServerRootChoose;

    @NonNull
    public final ConstraintLayout chooseServerRootLoading;

    @NonNull
    public final ScrollView listServersChoose;

    @NonNull
    public final TextView loadingText;

    @NonNull
    public final ScrollView mainServersChoose;

    @NonNull
    public final RoundCornerProgressBar progressBar;

    @NonNull
    public final LottieAnimationView progressBarRadial;

    @NonNull
    public final FrameLayout rootView;

    @NonNull
    public final LinearLayout scrollLayoutServers;

    @NonNull
    public final View serverListBackColor;

    @NonNull
    public final FrameLayout serverMainFrame;

    @NonNull
    public final AppCompatButton serversBtnMyServer;

    @NonNull
    public final TextView tvBr;

    @NonNull
    public final TextView tvBr2;

    public ServerSelectWithLoadProgressBinding(@NonNull FrameLayout rootView, @NonNull AppCompatButton allServersButton, @NonNull TextView brLsProgress, @NonNull ImageView brServerImage, @NonNull TextView brServerName, @NonNull TextView brServerOnline, @NonNull RoundCornerProgressBar brServerProgress, @NonNull TextView brServerX2, @NonNull AppCompatButton brServersPlay, @NonNull LinearLayout chooseServerRootChoose, @NonNull ConstraintLayout chooseServerRootLoading, @NonNull ScrollView listServersChoose, @NonNull TextView loadingText, @NonNull ScrollView mainServersChoose, @NonNull RoundCornerProgressBar progressBar, @NonNull LottieAnimationView progressBarRadial, @NonNull LinearLayout scrollLayoutServers, @NonNull View serverListBackColor, @NonNull FrameLayout serverMainFrame, @NonNull AppCompatButton serversBtnMyServer, @NonNull TextView tvBr, @NonNull TextView tvBr2) {
        this.rootView = rootView;
        this.allServersButton = allServersButton;
        this.brLsProgress = brLsProgress;
        this.brServerImage = brServerImage;
        this.brServerName = brServerName;
        this.brServerOnline = brServerOnline;
        this.brServerProgress = brServerProgress;
        this.brServerX2 = brServerX2;
        this.brServersPlay = brServersPlay;
        this.chooseServerRootChoose = chooseServerRootChoose;
        this.chooseServerRootLoading = chooseServerRootLoading;
        this.listServersChoose = listServersChoose;
        this.loadingText = loadingText;
        this.mainServersChoose = mainServersChoose;
        this.progressBar = progressBar;
        this.progressBarRadial = progressBarRadial;
        this.scrollLayoutServers = scrollLayoutServers;
        this.serverListBackColor = serverListBackColor;
        this.serverMainFrame = serverMainFrame;
        this.serversBtnMyServer = serversBtnMyServer;
        this.tvBr = tvBr;
        this.tvBr2 = tvBr2;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ServerSelectWithLoadProgressBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ServerSelectWithLoadProgressBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.server_select_with_load_progress, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static ServerSelectWithLoadProgressBinding bind(@NonNull View rootView) {
        int i = R.id.all_servers_button;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.all_servers_button);
        if (appCompatButton != null) {
            i = R.id.br_ls_progress;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.br_ls_progress);
            if (textView != null) {
                i = R.id.br_server_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.br_server_image);
                if (imageView != null) {
                    i = R.id.br_server_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.br_server_name);
                    if (textView2 != null) {
                        i = R.id.br_server_online;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.br_server_online);
                        if (textView3 != null) {
                            i = R.id.br_server_progress;
                            RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) ViewBindings.findChildViewById(rootView, R.id.br_server_progress);
                            if (roundCornerProgressBar != null) {
                                i = R.id.br_server_x2;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.br_server_x2);
                                if (textView4 != null) {
                                    i = R.id.br_servers_play;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.br_servers_play);
                                    if (appCompatButton2 != null) {
                                        i = R.id.choose_server_root_choose;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.choose_server_root_choose);
                                        if (linearLayout != null) {
                                            i = R.id.choose_server_root_loading;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.choose_server_root_loading);
                                            if (constraintLayout != null) {
                                                i = R.id.list_servers_choose;
                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.list_servers_choose);
                                                if (scrollView != null) {
                                                    i = R.id.loading_text;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loading_text);
                                                    if (textView5 != null) {
                                                        i = R.id.main_servers_choose;
                                                        ScrollView scrollView2 = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.main_servers_choose);
                                                        if (scrollView2 != null) {
                                                            i = R.id.progress_bar;
                                                            RoundCornerProgressBar roundCornerProgressBar2 = (RoundCornerProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                                                            if (roundCornerProgressBar2 != null) {
                                                                i = R.id.progress_bar_radial;
                                                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.progress_bar_radial);
                                                                if (lottieAnimationView != null) {
                                                                    i = R.id.scroll_layout_servers;
                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.scroll_layout_servers);
                                                                    if (linearLayout2 != null) {
                                                                        i = R.id.server_list_back_color;
                                                                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.server_list_back_color);
                                                                        if (viewFindChildViewById != null) {
                                                                            i = R.id.server_main_frame;
                                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.server_main_frame);
                                                                            if (frameLayout != null) {
                                                                                i = R.id.servers_btn_my_server;
                                                                                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.servers_btn_my_server);
                                                                                if (appCompatButton3 != null) {
                                                                                    i = R.id.tv_br;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_br);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.tv_br_2;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_br_2);
                                                                                        if (textView7 != null) {
                                                                                            return new ServerSelectWithLoadProgressBinding((FrameLayout) rootView, appCompatButton, textView, imageView, textView2, textView3, roundCornerProgressBar, textView4, appCompatButton2, linearLayout, constraintLayout, scrollView, textView5, scrollView2, roundCornerProgressBar2, lottieAnimationView, linearLayout2, viewFindChildViewById, frameLayout, appCompatButton3, textView6, textView7);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
