package org.jfrog.build.extractor.clientConfiguration.client.access;

import java.io.IOException;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.Version;
import org.jfrog.build.extractor.clientConfiguration.client.ManagerBase;
import org.jfrog.build.extractor.clientConfiguration.client.access.services.CreateProject;
import org.jfrog.build.extractor.clientConfiguration.client.access.services.DeleteProject;
import org.jfrog.build.extractor.clientConfiguration.client.access.services.GetProject;
import org.jfrog.build.extractor.clientConfiguration.client.access.services.UpdateProject;

/* loaded from: classes5.dex */
public class AccessManager extends ManagerBase {
    @Override // org.jfrog.build.extractor.clientConfiguration.client.ManagerBase
    public Version getVersion() throws IOException {
        return null;
    }

    public AccessManager(String str, String str2, Log log) {
        super(str, "", "", str2, log);
    }

    public void createProject(String str) throws IOException {
        new CreateProject(str, this.log).execute(this.jfrogHttpClient);
    }

    public void updateProject(String str, String str2) throws IOException {
        new UpdateProject(str, str2, this.log).execute(this.jfrogHttpClient);
    }

    public void deleteProject(String str) throws IOException {
        new DeleteProject(str, this.log).execute(this.jfrogHttpClient);
    }

    public String getProject(String str) throws IOException {
        return new GetProject(str, this.log).execute(this.jfrogHttpClient);
    }
}
