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
 * Move action results
 * 
 * This structure is returned to your client after it calls the move function.
 * It includes a string message (useful for debugging), a boolean indicating
 * action success, as well as the new state for your dinosaur. The most common
 * reason for the boolean succeeded returning False is your dinosaur attempted
 * to move into impassable terrain.
 */
public class MoveResults implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MoveResults");
  private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRING, (short)1);
  private static final TField SUCCEEDED_FIELD_DESC = new TField("succeeded", TType.BOOL, (short)2);
  private static final TField MY_STATE_FIELD_DESC = new TField("myState", TType.STRUCT, (short)3);

  public String message;
  public static final int MESSAGE = 1;
  public boolean succeeded;
  public static final int SUCCEEDED = 2;
  public DinosaurState myState;
  public static final int MYSTATE = 3;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean succeeded = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(MESSAGE, new FieldMetaData("message", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(SUCCEEDED, new FieldMetaData("succeeded", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    put(MYSTATE, new FieldMetaData("myState", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DinosaurState.class)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(MoveResults.class, metaDataMap);
  }

  public MoveResults() {
  }

  public MoveResults(
    String message,
    boolean succeeded,
    DinosaurState myState)
  {
    this();
    this.message = message;
    this.succeeded = succeeded;
    this.__isset.succeeded = true;
    this.myState = myState;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MoveResults(MoveResults other) {
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    __isset.succeeded = other.__isset.succeeded;
    this.succeeded = other.succeeded;
    if (other.isSetMyState()) {
      this.myState = new DinosaurState(other.myState);
    }
  }

  @Override
  public MoveResults clone() {
    return new MoveResults(this);
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

  public DinosaurState getMyState() {
    return this.myState;
  }

  public void setMyState(DinosaurState myState) {
    this.myState = myState;
  }

  public void unsetMyState() {
    this.myState = null;
  }

  // Returns true if field myState is set (has been asigned a value) and false otherwise
  public boolean isSetMyState() {
    return this.myState != null;
  }

  public void setMyStateIsSet(boolean value) {
    if (!value) {
      this.myState = null;
    }
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

    case MYSTATE:
      if (value == null) {
        unsetMyState();
      } else {
        setMyState((DinosaurState)value);
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

    case MYSTATE:
      return getMyState();

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
    case MYSTATE:
      return isSetMyState();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MoveResults)
      return this.equals((MoveResults)that);
    return false;
  }

  public boolean equals(MoveResults that) {
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

    boolean this_present_myState = true && this.isSetMyState();
    boolean that_present_myState = true && that.isSetMyState();
    if (this_present_myState || that_present_myState) {
      if (!(this_present_myState && that_present_myState))
        return false;
      if (!this.myState.equals(that.myState))
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
        case MYSTATE:
          if (field.type == TType.STRUCT) {
            this.myState = new DinosaurState();
            this.myState.read(iprot);
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
    if (this.myState != null) {
      oprot.writeFieldBegin(MY_STATE_FIELD_DESC);
      this.myState.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MoveResults(");
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
    sb.append("myState:");
    if (this.myState == null) {
      sb.append("null");
    } else {
      sb.append(this.myState);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

