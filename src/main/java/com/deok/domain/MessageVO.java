package com.deok.domain;


import java.util.Date;

public class MessageVO {
    private int    idx;
    private String sender;
    private String receiver;
    private String title;
    private String summary;
    private String message;
    private Date   regDate;

    public int getIdx() {
        return idx;
    }

    public MessageVO setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public MessageVO setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public MessageVO setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MessageVO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public MessageVO setMessage(String message) {
        this.message = message;
        return this;
    }

    public Date getRegDate() {
        return regDate;
    }

    public MessageVO setRegDate(Date regDate) {
        this.regDate = regDate;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public MessageVO setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MessageVO{");
        sb.append("idx=").append(idx);
        sb.append(", sender='").append(sender).append('\'');
        sb.append(", receiver='").append(receiver).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", summary='").append(summary).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", regDate=").append(regDate);
        sb.append('}');
        return sb.toString();
    }
}
