package com.blackhub.bronline.game.gui.minigameevents;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperKeys;
import com.bless.client.R;

/* loaded from: classes2.dex */
public class UILayoutMiniGameEventsGamePrize extends UILayout {
    public final GUIMiniGameEventsGame mRoot;
    public View mViewRoot = null;
    public ImageView mImage = null;
    public TextView mSubHeader = null;
    public TextView mHeader = null;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    public UILayoutMiniGameEventsGamePrize(GUIMiniGameEventsGame root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.halloween_game_prize, container, false);
        this.mViewRoot = viewInflate;
        this.mImage = (ImageView) viewInflate.findViewById(R.id.image);
        this.mSubHeader = (TextView) this.mViewRoot.findViewById(R.id.info);
        this.mHeader = (TextView) this.mViewRoot.findViewById(R.id.header);
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
        String strOptString = this.mRoot.getJson().optString("n");
        int iOptInt = this.mRoot.getJson().optInt("r", -1);
        this.mSubHeader.setText(this.mRoot.getJson().optString("m"));
        this.mHeader.setText(this.mRoot.getJson().optString("h"));
        if (!strOptString.equals("null") && !strOptString.isEmpty()) {
            this.mImage.setImageResource(getContext().getResources().getIdentifier(strOptString, "drawable", getContext().getPackageName()));
        } else {
            if (iOptInt == -1) {
                return;
            }
            final JNIActivity jNIActivity = (JNIActivity) getContext();
            GameRender.getInstance().RequestRender(this.mRoot.getJson().optInt("s"), 0, iOptInt, 0, 0, (float) this.mRoot.getJson().optDouble(MiniGamesHelperKeys.ROT_X_KEY), (float) this.mRoot.getJson().optDouble(MiniGamesHelperKeys.ROT_Y_KEY), (float) this.mRoot.getJson().optDouble(MiniGamesHelperKeys.ROT_Z_KEY), (float) this.mRoot.getJson().optDouble("z"), new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGamePrize$$ExternalSyntheticLambda0
                @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                public final void OnRenderComplete(int i, Bitmap bitmap) {
                    this.f$0.lambda$onLayoutShown$1(jNIActivity, i, bitmap);
                }
            });
        }
    }

    public final /* synthetic */ void lambda$onLayoutShown$1(JNIActivity jNIActivity, int i, final Bitmap bitmap) {
        jNIActivity.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGamePrize$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onLayoutShown$0(bitmap);
            }
        });
    }

    public final /* synthetic */ void lambda$onLayoutShown$0(Bitmap bitmap) {
        this.mImage.setImageBitmap(bitmap);
        this.mImage.animate().alpha(1.0f).setDuration(300L);
    }
}
