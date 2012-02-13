/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.facebook.puzzles.dinoisland.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

/**
 * Lay an Egg action results
 * 
 * This structure is returned to your client after it calls the egg function.
 * It includes a string message (useful for debugging), a boolean indicating
 * action success, the new state of your dinosaur, and the integer egg ID of
 * your newly created egg if the action was successful. If the egg function
 * fails, the egg ID will be 0.
 */
public class EggResults implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("EggResults");
  private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRING, (short)1);
  private static final TField SUCCEEDED_FIELD_DESC = new TField("succeeded", TType.BOOL, (short)2);
  private static final TField PARENT_DINO_STATE_FIELD_DESC = new TField("parentDinoState", TType.STRUCT, (short)3);
  private static final TField EGG_ID_FIELD_DESC = new TField("eggID", TType.I64, (short)4);

  public String message;
  public static final int MESSAGE = 1;
  public boolean succeeded;
  public static final int SUCCEEDED = 2;
  public DinosaurState parentDinoState;
  public static final int PARENTDINOSTATE = 3;
  public long eggID;
  public static final int EGGID = 4;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean succeeded = false;
    public boolean eggID = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(MESSAGE, new FieldMetaData("message", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(SUCCEEDED, new FieldMetaData("succeeded", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    put(PARENTDINOSTATE, new FieldMetaData("parentDinoState", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DinosaurState.class)));
    put(EGGID, new FieldMetaData("eggID", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(EggResults.class, metaDataMap);
  }

  public EggResults() {
  }

  public EggResults(
    String message,
    boolean succeeded,
    DinosaurState parentDinoState,
    long eggID)
  {
    this();
    this.message = message;
    this.succeeded = succeeded;
    this.__isset.succeeded = true;
    this.parentDinoState = parentDinoState;
    this.eggID = eggID;
    this.__isset.eggID = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EggResults(EggResults other) {
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    __isset.succeeded = other.__isset.succeeded;
    this.succeeded = other.succeeded;
    if (other.isSetParentDinoState()) {
      this.parentDinoState = new DinosaurState(other.parentDinoState);
    }
    __isset.eggID = other.__isset.eggID;
    this.eggID = other.eggID;
  }

  @Override
  public EggResults clone() {
    return new EggResults(this);
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void unsetMessage() {
    this.message = null;
  }

  // Returns true if field message is set (has been asigned a value) and false otherwise
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public boolean isSucceeded() {
    return this.succeeded;
  }

  public void setSucceeded(boolean succeeded) {
    this.succeeded = succeeded;
    this.__isset.succeeded = true;
  }

  public void unsetSucceeded() {
    this.__isset.succeeded = false;
  }

  // Returns true if field succeeded is set (has been asigned a value) and false otherwise
  public boolean isSetSucceeded() {
    return this.__isset.succeeded;
  }

  public void setSucceededIsSet(boolean value) {
    this.__isset.succeeded = value;
  }

  public DinosaurState getParentDinoState() {
    return this.parentDinoState;
  }

  public void setParentDinoState(DinosaurState parentDinoState) {
    this.parentDinoState = parentDinoState;
  }

  public void unsetParentDinoState() {
    this.parentDinoState = null;
  }

  // Returns true if field parentDinoState is set (has been asigned a value) and false otherwise
  public boolean isSetParentDinoState() {
    return this.parentDinoState != null;
  }

  public void setParentDinoStateIsSet(boolean value) {
    if (!value) {
      this.parentDinoState = null;
    }
  }

  public long getEggID() {
    return this.eggID;
  }

  public void setEggID(long eggID) {
    this.eggID = eggID;
    this.__isset.eggID = true;
  }

  public void unsetEggID() {
    this.__isset.eggID = false;
  }

  // Returns true if field eggID is set (has been asigned a value) and false otherwise
  public boolean isSetEggID() {
    return this.__isset.eggID;
  }

  public void setEggIDIsSet(boolean value) {
    this.__isset.eggID = value;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case SUCCEEDED:
      if (value == null) {
        unsetSucceeded();
      } else {
        setSucceeded((Boolean)value);
      }
      break;

    case PARENTDINOSTATE:
      if (value == null) {
        unsetParentDinoState();
      } else {
        setParentDinoState((DinosaurState)value);
      }
      break;

    case EGGID:
      if (value == null) {
        unsetEggID();
      } else {
        setEggID((Long)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MESSAGE:
      return getMessage();

    case SUCCEEDED:
      return new Boolean(isSucceeded());

    case PARENTDINOSTATE:
      return getParentDinoState();

    case EGGID:
      return new Long(getEggID());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case MESSAGE:
      return isSetMessage();
    case SUCCEEDED:
      return isSetSucceeded();
    case PARENTDINOSTATE:
      return isSetParentDinoState();
    case EGGID:
      return isSetEggID();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EggResults)
      return this.equals((EggResults)that);
    return false;
  }

  public boolean equals(EggResults that) {
    if (that == null)
      return false;

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_succeeded = true;
    boolean that_present_succeeded = true;
    if (this_present_succeeded || that_present_succeeded) {
      if (!(this_present_succeeded && that_present_succeeded))
        return false;
      if (this.succeeded != that.succeeded)
        return false;
    }

    boolean this_present_parentDinoState = true && this.isSetParentDinoState();
    boolean that_present_parentDinoState = true && that.isSetParentDinoState();
    if (this_present_parentDinoState || that_present_parentDinoState) {
      if (!(this_present_parentDinoState && that_present_parentDinoState))
        return false;
      if (!this.parentDinoState.equals(that.parentDinoState))
        return false;
    }

    boolean this_present_eggID = true;
    boolean that_present_eggID = true;
    if (this_present_eggID || that_present_eggID) {
      if (!(this_present_eggID && that_present_eggID))
        return false;
      if (this.eggID != that.eggID)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case MESSAGE:
          if (field.type == TType.STRING) {
            this.message = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SUCCEEDED:
          if (field.type == TType.BOOL) {
            this.succeeded = iprot.readBool();
            this.__isset.succeeded = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARENTDINOSTATE:
          if (field.type == TType.STRUCT) {
            this.parentDinoState = new DinosaurState();
            this.parentDinoState.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EGGID:
          if (field.type == TType.I64) {
            this.eggID = iprot.readI64();
            this.__isset.eggID = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SUCCEEDED_FIELD_DESC);
    oprot.writeBool(this.succeeded);
    oprot.writeFieldEnd();
    if (this.parentDinoState != null) {
      oprot.writeFieldBegin(PARENT_DINO_STATE_FIELD_DESC);
      this.parentDinoState.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(EGG_ID_FIELD_DESC);
    oprot.writeI64(this.eggID);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EggResults(");
    boolean first = true;

    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("succeeded:");
    sb.append(this.succeeded);
    first = false;
    if (!first) sb.append(", ");
    sb.append("parentDinoState:");
    if (this.parentDinoState == null) {
      sb.append("null");
    } else {
      sb.append(this.parentDinoState);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eggID:");
    sb.append(this.eggID);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

