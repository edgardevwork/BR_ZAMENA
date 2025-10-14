package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.jfrog.build.api.repository.RepositoryConfig;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.RepositoryType;

/* loaded from: classes5.dex */
public class CheckRepositoryType extends JFrogService<Boolean> {
    public static final String REPOS_REST_URL = "api/repositories/";
    public final String repositoryKey;
    public final RepositoryType repositoryType;

    public CheckRepositoryType(RepositoryType repositoryType, String str, Log log) {
        super(log);
        this.repositoryType = repositoryType;
        this.repositoryKey = str;
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        return new HttpGet("api/repositories/" + this.repositoryKey);
    }

    /* renamed from: org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.CheckRepositoryType$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C112951 {

        /* renamed from: $SwitchMap$org$jfrog$build$extractor$clientConfiguration$client$RepositoryType */
        public static final /* synthetic */ int[] f10014x106fba58;

        static {
            int[] iArr = new int[RepositoryType.values().length];
            f10014x106fba58 = iArr;
            try {
                iArr[RepositoryType.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10014x106fba58[RepositoryType.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [TResult, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [TResult, java.lang.Boolean] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        RepositoryConfig repositoryConfig = (RepositoryConfig) getMapper().readValue(inputStream, RepositoryConfig.class);
        int i = C112951.f10014x106fba58[this.repositoryType.ordinal()];
        if (i == 1) {
            this.result = Boolean.valueOf(ImagesContract.LOCAL.equals(repositoryConfig.getRclass()));
        } else {
            if (i != 2) {
                return;
            }
            this.result = Boolean.valueOf("remote".equals(repositoryConfig.getRclass()));
        }
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to retrieve repository configuration '" + this.repositoryKey + "'");
        JFrogService.throwException(httpEntity, getStatusCode());
    }
}
