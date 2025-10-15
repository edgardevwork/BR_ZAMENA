package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.impl.C10085c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class FullUrlFormer<T> {

    /* renamed from: a */
    private List f9584a = new ArrayList();

    /* renamed from: b */
    private int f9585b = -1;

    /* renamed from: c */
    private String f9586c;

    /* renamed from: d */
    private final IParamsAppender f9587d;

    /* renamed from: e */
    private final ConfigProvider f9588e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f9587d = iParamsAppender;
        this.f9588e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f9584a.get(this.f9585b)).buildUpon();
        this.f9587d.appendParams(builderBuildUpon, this.f9588e.getConfig());
        this.f9586c = builderBuildUpon.build().toString();
    }

    @Nullable
    public List<String> getAllHosts() {
        return this.f9584a;
    }

    @Nullable
    public String getUrl() {
        return new C10085c(this.f9586c).f9559a;
    }

    public boolean hasMoreHosts() {
        return this.f9585b + 1 < this.f9584a.size();
    }

    public void incrementAttemptNumber() {
        this.f9585b++;
    }

    public void setHosts(@Nullable List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f9584a = list;
    }
}
