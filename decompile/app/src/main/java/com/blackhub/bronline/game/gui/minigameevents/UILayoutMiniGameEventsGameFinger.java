package com.blackhub.bronline.game.gui.minigameevents;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.bless.client.R;
import java.util.Objects;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UILayoutMiniGameEventsGameFinger extends UILayout {
    public final GUIMiniGameEventsGame mRoot;
    public View mViewRoot = null;
    public int mLineWidth = -1;
    public int mChunk = -1;
    public FrameLayout mLine = null;
    public RunVerticalLineView mVerticalLine = null;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    /* loaded from: classes3.dex */
    public class RunVerticalLineView extends View {
        public final Drawable drawable;
        public final int maxWidth;
        public double percentOfWidth;
        public boolean reverse;
        public final Double speed;

        /* renamed from: x */
        public float f423x;

        public RunVerticalLineView(Context context, int maxWidth) {
            super(context);
            this.f423x = 0.0f;
            this.percentOfWidth = 0.0062814070351759d;
            this.reverse = false;
            this.maxWidth = maxWidth;
            this.speed = Double.valueOf(maxWidth * 0.0062814070351759d);
            setWillNotDraw(false);
            this.drawable = ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.bg_mini_game_events_halloween_vertical_finger_line, null);
        }

        public boolean isHitted() {
            return this.f423x >= ((float) (UILayoutMiniGameEventsGameFinger.this.mChunk * 100)) && this.f423x <= ((float) (UILayoutMiniGameEventsGameFinger.this.mChunk * 100)) + (((float) UILayoutMiniGameEventsGameFinger.this.mLineWidth) / 4.0f);
        }

        @Override // android.view.View
        public void draw(@NonNull Canvas canvas) {
            super.draw(canvas);
            Drawable drawable = this.drawable;
            float f = this.f423x;
            drawable.setBounds((int) f, 0, ((int) f) + 20, getHeight());
            this.drawable.draw(canvas);
            if (this.reverse) {
                this.f423x = (float) (this.f423x - this.speed.doubleValue());
            } else {
                this.f423x = (float) (this.f423x + this.speed.doubleValue());
            }
            float f2 = this.f423x;
            if (((int) f2) >= this.maxWidth - 20) {
                this.reverse = true;
                this.f423x = r1 - 20;
            } else if (((int) f2) <= 0) {
                this.reverse = false;
                this.f423x = 0.0f;
            }
            invalidate();
        }
    }

    public UILayoutMiniGameEventsGameFinger(GUIMiniGameEventsGame root) {
        this.mRoot = root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    /* renamed from: getView */
    public View getMViewRoot() {
        return this.mViewRoot;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public View onCreateView(LayoutInflater inflater, ViewGroup container) {
        View viewInflate = inflater.inflate(R.layout.halloween_game_finger, container, false);
        this.mViewRoot = viewInflate;
        this.mLine = (FrameLayout) viewInflate.findViewById(R.id.line);
        ((Button) this.mViewRoot.findViewById(R.id.finger)).setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameFinger$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                this.f$0.lambda$onCreateView$0(view);
            }
        });
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameFinger.1
            public ViewTreeObserverOnGlobalLayoutListenerC43681() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                UILayoutMiniGameEventsGameFinger.this.mViewRoot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((JNIActivity) UILayoutMiniGameEventsGameFinger.this.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) UILayoutMiniGameEventsGameFinger.this.mLine.getLayoutParams();
                layoutParams.width = displayMetrics.widthPixels - (FloatExtensionKt.dpToPx(40.0f, UILayoutMiniGameEventsGameFinger.this.getContext()) * 2);
                UILayoutMiniGameEventsGameFinger.this.mLine.setLayoutParams(layoutParams);
                UILayoutMiniGameEventsGameFinger.this.mLineWidth = layoutParams.width;
                int iNextInt = new Random().nextInt(5) + 2;
                UILayoutMiniGameEventsGameFinger uILayoutMiniGameEventsGameFinger = UILayoutMiniGameEventsGameFinger.this;
                uILayoutMiniGameEventsGameFinger.mChunk = (uILayoutMiniGameEventsGameFinger.mLineWidth / 100) / iNextInt;
                View view = new View(UILayoutMiniGameEventsGameFinger.this.getContext());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(UILayoutMiniGameEventsGameFinger.this.mLineWidth / 4, -1);
                layoutParams2.setMargins(UILayoutMiniGameEventsGameFinger.this.mChunk * 100, 0, 0, 0);
                layoutParams2.gravity = GravityCompat.START;
                view.setLayoutParams(layoutParams2);
                view.setBackgroundColor(Color.parseColor("#43CD7F"));
                ((ViewGroup) UILayoutMiniGameEventsGameFinger.this.mViewRoot.findViewById(R.id.subline)).addView(view);
                UILayoutMiniGameEventsGameFinger uILayoutMiniGameEventsGameFinger2 = UILayoutMiniGameEventsGameFinger.this;
                UILayoutMiniGameEventsGameFinger uILayoutMiniGameEventsGameFinger3 = UILayoutMiniGameEventsGameFinger.this;
                uILayoutMiniGameEventsGameFinger2.mVerticalLine = uILayoutMiniGameEventsGameFinger3.new RunVerticalLineView(uILayoutMiniGameEventsGameFinger3.getContext(), UILayoutMiniGameEventsGameFinger.this.mLineWidth);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams3.gravity = GravityCompat.START;
                UILayoutMiniGameEventsGameFinger.this.mVerticalLine.setLayoutParams(layoutParams3);
                UILayoutMiniGameEventsGameFinger.this.mLine.addView(UILayoutMiniGameEventsGameFinger.this.mVerticalLine);
            }
        });
        return this.mViewRoot;
    }

    public final /* synthetic */ void lambda$onCreateView$0(View view) throws JSONException {
        if (this.mVerticalLine.isHitted()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("s", 1);
                this.mRoot.getGuiManager().sendJsonData(this.mRoot.getScreenId(), jSONObject);
                this.mRoot.close(null);
                return;
            } catch (Exception e) {
                String message = e.getMessage();
                Objects.requireNonNull(message);
                UtilsKt.crashlyticsRecordNewException(message);
                return;
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("s", 0);
            this.mRoot.getGuiManager().sendJsonData(this.mRoot.getScreenId(), jSONObject2);
            this.mRoot.close(null);
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            Objects.requireNonNull(message2);
            UtilsKt.crashlyticsRecordNewException(message2);
        }
    }

    /* renamed from: com.blackhub.bronline.game.gui.minigameevents.UILayoutMiniGameEventsGameFinger$1 */
    /* loaded from: classes3.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC43681 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC43681() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UILayoutMiniGameEventsGameFinger.this.mViewRoot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((JNIActivity) UILayoutMiniGameEventsGameFinger.this.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) UILayoutMiniGameEventsGameFinger.this.mLine.getLayoutParams();
            layoutParams.width = displayMetrics.widthPixels - (FloatExtensionKt.dpToPx(40.0f, UILayoutMiniGameEventsGameFinger.this.getContext()) * 2);
            UILayoutMiniGameEventsGameFinger.this.mLine.setLayoutParams(layoutParams);
            UILayoutMiniGameEventsGameFinger.this.mLineWidth = layoutParams.width;
            int iNextInt = new Random().nextInt(5) + 2;
            UILayoutMiniGameEventsGameFinger uILayoutMiniGameEventsGameFinger = UILayoutMiniGameEventsGameFinger.this;
            uILayoutMiniGameEventsGameFinger.mChunk = (uILayoutMiniGameEventsGameFinger.mLineWidth / 100) / iNextInt;
            View view = new View(UILayoutMiniGameEventsGameFinger.this.getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(UILayoutMiniGameEventsGameFinger.this.mLineWidth / 4, -1);
            layoutParams2.setMargins(UILayoutMiniGameEventsGameFinger.this.mChunk * 100, 0, 0, 0);
            layoutParams2.gravity = GravityCompat.START;
            view.setLayoutParams(layoutParams2);
            view.setBackgroundColor(Color.parseColor("#43CD7F"));
            ((ViewGroup) UILayoutMiniGameEventsGameFinger.this.mViewRoot.findViewById(R.id.subline)).addView(view);
            UILayoutMiniGameEventsGameFinger uILayoutMiniGameEventsGameFinger2 = UILayoutMiniGameEventsGameFinger.this;
            UILayoutMiniGameEventsGameFinger uILayoutMiniGameEventsGameFinger3 = UILayoutMiniGameEventsGameFinger.this;
            uILayoutMiniGameEventsGameFinger2.mVerticalLine = uILayoutMiniGameEventsGameFinger3.new RunVerticalLineView(uILayoutMiniGameEventsGameFinger3.getContext(), UILayoutMiniGameEventsGameFinger.this.mLineWidth);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.gravity = GravityCompat.START;
            UILayoutMiniGameEventsGameFinger.this.mVerticalLine.setLayoutParams(layoutParams3);
            UILayoutMiniGameEventsGameFinger.this.mLine.addView(UILayoutMiniGameEventsGameFinger.this.mVerticalLine);
        }
    }
}
