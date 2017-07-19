/**
 * Record.java - Traackr, Inc.
 *
 * This document set is the property of Traackr, Inc., a Massachusetts
 * Corporation, and contains confidential and trade secret information. It
 * cannot be transferred from the custody or control of Traackr except as
 * authorized in writing by an officer of Traackr. Neither this item nor the
 * information it contains can be used, transferred, reproduced, published,
 * or disclosed, in whole or in part, directly or indirectly, except as
 * expressly authorized by an officer of Traackr, pursuant to written
 * agreement.
 *
 * Copyright 2012-2015 Traackr, Inc. All Rights Reserved.
 */

package com.traackr.mongo.tailer.model;

import org.bson.Document;

/**
 * @author wwinder
 *         Created on: 12/14/16
 */
public class Record {
  public final OplogLine oplogLine;
  public final Document importLine;

  public Record(OplogLine line) {
    oplogLine = line;
    importLine = null;
  }

  public Record(Document line) {
    oplogLine = null;
    importLine = line;
  }
}