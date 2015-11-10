/**
 * Copyright (c) 2008-2015, Massachusetts Institute of Technology (MIT)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package edu.mit.ll.nics.common.entity.datalayer;

// Generated Nov 30, 2011 2:53:26 PM by Hibernate Tools 3.4.0.CR1
import edu.mit.ll.nics.common.entity.SADisplayMessageEntity;
import edu.mit.ll.nics.common.entity.SADisplayPersistedEntity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import edu.mit.ll.nics.common.entity.Usersession;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Document generated by hbm2java
 */
@Entity
@Table(name = "document", schema = "public")
public class Document extends SADisplayMessageEntity implements SADisplayPersistedEntity {

    private String documentid;
    private Usersession usersession;
    private int usersessionid;
    private Folder folder;
    private String folderid;
    private Datasource datasource;
    private String datasourceid;
    private String displayname;
    private String filetype;
    private String filename;
    private boolean globalview;
    private Date created;
    private String description;
    private Set<DocumentOrg> documentOrgs = new HashSet<DocumentOrg>(0);
    private Set<DocumentIncident> documentIncidents = new HashSet<DocumentIncident>(
            0);
    private Set<DocumentUser> documentUsers = new HashSet<DocumentUser>(0);
    private Set<DocumentCollabroom> documentCollabrooms = new HashSet<DocumentCollabroom>(
            0);

    public Document() {
    }

    public Document(String documentid, Usersession usersession, Folder folder,
            Datasource datasource, String displayname, String filetype,
            boolean globalview, Date created) {
        this.documentid = documentid;
        this.usersession = usersession;
        this.folder = folder;
        this.datasource = datasource;
        this.displayname = displayname;
        this.filetype = filetype;
        this.globalview = globalview;
        this.created = created;
    }

    public Document(String documentid, Usersession usersession, Folder folder,
            Datasource datasource, String displayname, String filetype,
            boolean globalview, Date created, Set<DocumentOrg> documentOrgs,
            Set<DocumentIncident> documentIncidents,
            Set<DocumentUser> documentUsers,
            Set<DocumentCollabroom> documentCollabrooms) {
        this.documentid = documentid;
        this.usersession = usersession;
        this.folder = folder;
        this.datasource = datasource;
        this.displayname = displayname;
        this.filetype = filetype;
        this.globalview = globalview;
        this.created = created;
        this.documentOrgs = documentOrgs;
        this.documentIncidents = documentIncidents;
        this.documentUsers = documentUsers;
        this.documentCollabrooms = documentCollabrooms;
    }

    @Id
    @Column(name = "documentid", unique = true, nullable = false)
    public String getDocumentid() {
        return this.documentid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usersessionid", insertable = false, updatable = false)
    public Usersession getUsersession() {
        return this.usersession;
    }

    public void setUsersession(Usersession usersession) {
        this.usersession = usersession;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "folderid", insertable = false, updatable = false)
    public Folder getFolder() {
        return this.folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "datasourceid", insertable = false, updatable = false)
    public Datasource getDatasource() {
        return this.datasource;
    }

    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }

    @Column(name = "displayname", nullable = false, length = 256)
    public String getDisplayname() {
        return this.displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    @Column(name = "filetype", nullable = false, length = 256)
    public String getFiletype() {
        return this.filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    
    @Column(name = "filename", nullable = false, length = 256)
    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Column(name = "globalview", nullable = false)
    public boolean getGlobalview() {
        return this.globalview;
    }

    public void setGlobalview(boolean globalview) {
        this.globalview = globalview;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false, length = 29)
    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    public Set<DocumentOrg> getDocumentOrgs() {
        return this.documentOrgs;
    }

    public void setDocumentOrgs(Set<DocumentOrg> documentOrgs) {
        this.documentOrgs = documentOrgs;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    public Set<DocumentIncident> getDocumentIncidents() {
        return this.documentIncidents;
    }

    public void setDocumentIncidents(Set<DocumentIncident> documentIncidents) {
        this.documentIncidents = documentIncidents;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    public Set<DocumentUser> getDocumentUsers() {
        return this.documentUsers;
    }

    public void setDocumentUsers(Set<DocumentUser> documentUsers) {
        this.documentUsers = documentUsers;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document")
    public Set<DocumentCollabroom> getDocumentCollabrooms() {
        return this.documentCollabrooms;
    }

    public void setDocumentCollabrooms(
            Set<DocumentCollabroom> documentCollabrooms) {
        this.documentCollabrooms = documentCollabrooms;
    }

    @Column(name = "datasourceid", nullable = false)
    public String getDatasourceid() {
        return datasourceid;
    }

    public void setDatasourceid(String datasourceid) {
        this.datasourceid = datasourceid;
    }

    @Column(name = "folderid", nullable = false)
    public String getFolderid() {
        return folderid;
    }

    public void setFolderid(String folderid) {
        this.folderid = folderid;
    }

    @Column(name = "usersessionid", nullable = false)
    public int getUsersessionid() {
        return usersessionid;
    }

    public void setUsersessionid(int usersessionid) {
        this.usersessionid = usersessionid;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	@Override
    public JSONObject toJSONObject() {
        JSONObject json = new JSONObject();
        try {
            json.put("documentid", this.documentid);
            json.put("created", this.created);
            json.put("displayname", this.displayname);
            json.put("filetype", this.filetype);
            json.put("filename", this.filename);
            json.put("globalview", this.globalview);
            json.put("datasourceid", this.datasourceid);
            json.put("folderid", this.folderid);
            json.put("usersessionid", this.usersessionid);
        } catch (JSONException ex) {
            Logger.getLogger(Document.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
}
