package com.yipin.web.bootstrap.shared;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_resource")
public class Resource implements Serializable {

  @Id
  private String id;

  private String fileName;

  public String getFileName() {
    return fileName;
  }

  public String getId() {
    return id;
  }

  public void setFileName(final String fileName) {
    this.fileName = fileName;
  }

  public void setId(final String id) {
    this.id = id;
  }

}
