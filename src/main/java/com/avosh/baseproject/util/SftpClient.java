package com.avosh.baseproject.util;

import com.avosh.baseproject.excptions.SFTPConnectionException;
import com.enterprisedt.net.ftp.FTPClient;
import com.enterprisedt.net.ftp.FTPException;
import com.enterprisedt.net.ftp.FTPMessageCollector;
import com.jcraft.jsch.*;


import java.io.IOException;


public class SftpClient {

    private String host;
    private int port;
    private String user;
    private String password;
    private String localSourceDIR;
    private String remoteDestDIR;
    private String remoteSourceDIR;
    private String localDestDIR;
    private FTPClient ftp;
    private FTPMessageCollector listener;


    public SftpClient(String host , String user , String password , String localSourceDIR
            , String remoteDestDIR , String remoteSourceDIR , String localDestDIR , int port) {
        this.host = host;
        this.user = user;
        this.password = password;
        this.localSourceDIR = localSourceDIR;
        this.remoteDestDIR = remoteDestDIR;
        this.remoteSourceDIR = remoteSourceDIR;
        this.localDestDIR = localDestDIR;
        this.port = port;
        this.ftp = new FTPClient();
        this.listener = new FTPMessageCollector();
        this.ftp.setMessageListener(this.listener);
    }



    public void uploadFileSSH(String fileName) throws FTPException, IOException {
        JSch jsch = new JSch();
        Session session = null;
        try {
            session = jsch.getSession(this.user, this.host, this.port);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(this.password);
            session.connect();
            Channel channel = session.openChannel("sftp");
            channel.connect();
            ChannelSftp sftpChannel = (ChannelSftp) channel;
            sftpChannel.put(this.localSourceDIR + "/" + fileName, this.remoteDestDIR + "/" + fileName);
            sftpChannel.exit();
            session.disconnect();
        } catch (JSchException e) {
            throw new SFTPConnectionException(e);
        } catch (SftpException e) {
            throw new SFTPConnectionException(e);
        }
    }

    public void downloadDir(String srcRemoteDir , String destLocalDir){
        JSch jsch = new JSch();
        Session session = null;
        try {
            session = jsch.getSession(this.user, this.host, this.port);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(this.password);
            session.connect();
            Channel channel = session.openChannel("sftp");
            channel.connect();
            ChannelSftp sftpChannel = (ChannelSftp) channel;

            sftpChannel.get(this.remoteSourceDIR,this.localDestDIR);
            sftpChannel.exit();
            session.disconnect();
        } catch (JSchException e) {
            throw new SFTPConnectionException(e);
        } catch (SftpException e) {
            throw new SFTPConnectionException(e);
        }

    }

}
