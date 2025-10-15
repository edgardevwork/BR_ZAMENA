package org.jfrog.build.extractor.clientConfiguration.client.distribution;

import java.io.IOException;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.Version;
import org.jfrog.build.extractor.clientConfiguration.client.ManagerBase;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.CreateReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.DeleteReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.DistributeReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.request.UpdateReleaseBundleRequest;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.DistributeReleaseBundleResponse;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.DistributionStatusResponse;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.response.GetReleaseBundleStatusResponse;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.CreateReleaseBundle;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.DeleteLocalReleaseBundle;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.DeleteReleaseBundle;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.DistributeReleaseBundle;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.GetDistributionStatus;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.GetReleaseBundleVersion;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.SignReleaseBundle;
import org.jfrog.build.extractor.clientConfiguration.client.distribution.services.UpdateReleaseBundle;

/* loaded from: classes5.dex */
public class DistributionManager extends ManagerBase {
    public DistributionManager(String str, String str2, String str3, String str4, Log log) {
        super(str, str2, str3, str4, log);
    }

    public DistributionManager(String str, String str2, String str3, Log log) {
        super(str, str2, str3, "", log);
    }

    public DistributionManager(String str, String str2, Log log) {
        super(str, "", "", str2, log);
    }

    public DistributionManager(String str, Log log) {
        super(str, "", "", "", log);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.ManagerBase
    public Version getVersion() throws IOException {
        return new org.jfrog.build.extractor.clientConfiguration.client.distribution.services.Version(this.log).execute(this.jfrogHttpClient);
    }

    public void createReleaseBundle(CreateReleaseBundleRequest createReleaseBundleRequest, String str) throws IOException {
        new CreateReleaseBundle(createReleaseBundleRequest, str, this.log).execute(this.jfrogHttpClient);
    }

    public void createReleaseBundle(CreateReleaseBundleRequest createReleaseBundleRequest) throws IOException {
        createReleaseBundle(createReleaseBundleRequest, "");
    }

    public void updateReleaseBundle(String str, String str2, UpdateReleaseBundleRequest updateReleaseBundleRequest, String str3) throws IOException {
        new UpdateReleaseBundle(updateReleaseBundleRequest, str, str2, str3, this.log).execute(this.jfrogHttpClient);
    }

    public void updateReleaseBundle(String str, String str2, UpdateReleaseBundleRequest updateReleaseBundleRequest) throws IOException {
        updateReleaseBundle(str, str2, updateReleaseBundleRequest, "");
    }

    public void signReleaseBundle(String str, String str2, String str3, String str4) throws IOException {
        new SignReleaseBundle(str, str2, str3, str4, this.log).execute(this.jfrogHttpClient);
    }

    public void signReleaseBundle(String str, String str2, String str3) throws IOException {
        signReleaseBundle(str, str2, str3, "");
    }

    public GetReleaseBundleStatusResponse getReleaseBundleStatus(String str, String str2) throws IOException {
        return new GetReleaseBundleVersion(str, str2, this.log).execute(this.jfrogHttpClient);
    }

    public DistributeReleaseBundleResponse distributeReleaseBundle(String str, String str2, boolean z, DistributeReleaseBundleRequest distributeReleaseBundleRequest) throws IOException {
        return new DistributeReleaseBundle(str, str2, z, distributeReleaseBundleRequest, this.log).execute(this.jfrogHttpClient);
    }

    public DistributionStatusResponse getDistributionStatus(String str, String str2) throws IOException {
        return new GetDistributionStatus(str, str2, "", this.log).execute(this.jfrogHttpClient);
    }

    public DistributionStatusResponse getDistributionStatus(String str, String str2, String str3) throws IOException {
        return new GetDistributionStatus(str, str2, str3, this.log).execute(this.jfrogHttpClient);
    }

    public void deleteLocalReleaseBundle(String str, String str2) throws IOException {
        new DeleteLocalReleaseBundle(str, str2, this.log).execute(this.jfrogHttpClient);
    }

    public DistributeReleaseBundleResponse deleteReleaseBundle(String str, String str2, boolean z, DeleteReleaseBundleRequest deleteReleaseBundleRequest) throws IOException {
        return new DeleteReleaseBundle(str, str2, z, deleteReleaseBundleRequest, this.log).execute(this.jfrogHttpClient);
    }
}
