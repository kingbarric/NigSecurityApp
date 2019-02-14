/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.security.nexarssecurity.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Barima
 */
@Entity
@Table(name = "facial_feature")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FacialFeature.findAll", query = "SELECT f FROM FacialFeature f")
    , @NamedQuery(name = "FacialFeature.findById", query = "SELECT f FROM FacialFeature f WHERE f.id = :id")
    , @NamedQuery(name = "FacialFeature.findByFaceId", query = "SELECT f FROM FacialFeature f WHERE f.faceId = :faceId")
    , @NamedQuery(name = "FacialFeature.findByFacialTop", query = "SELECT f FROM FacialFeature f WHERE f.facialTop = :facialTop")
    , @NamedQuery(name = "FacialFeature.findByFaceLeft", query = "SELECT f FROM FacialFeature f WHERE f.faceLeft = :faceLeft")
    , @NamedQuery(name = "FacialFeature.findByFaceWidth", query = "SELECT f FROM FacialFeature f WHERE f.faceWidth = :faceWidth")
    , @NamedQuery(name = "FacialFeature.findByFaceHeight", query = "SELECT f FROM FacialFeature f WHERE f.faceHeight = :faceHeight")
    , @NamedQuery(name = "FacialFeature.findByHairColor", query = "SELECT f FROM FacialFeature f WHERE f.hairColor = :hairColor")
    , @NamedQuery(name = "FacialFeature.findBySmile", query = "SELECT f FROM FacialFeature f WHERE f.smile = :smile")
    , @NamedQuery(name = "FacialFeature.findByHeadposePitch", query = "SELECT f FROM FacialFeature f WHERE f.headposePitch = :headposePitch")
    , @NamedQuery(name = "FacialFeature.findByHeadposeRoll", query = "SELECT f FROM FacialFeature f WHERE f.headposeRoll = :headposeRoll")
    , @NamedQuery(name = "FacialFeature.findByHeadPoseYaw", query = "SELECT f FROM FacialFeature f WHERE f.headPoseYaw = :headPoseYaw")
    , @NamedQuery(name = "FacialFeature.findByGender", query = "SELECT f FROM FacialFeature f WHERE f.gender = :gender")
    , @NamedQuery(name = "FacialFeature.findByAge", query = "SELECT f FROM FacialFeature f WHERE f.age = :age")
    , @NamedQuery(name = "FacialFeature.findByFacialhairMustache", query = "SELECT f FROM FacialFeature f WHERE f.facialhairMustache = :facialhairMustache")
    , @NamedQuery(name = "FacialFeature.findByFacialhairBeard", query = "SELECT f FROM FacialFeature f WHERE f.facialhairBeard = :facialhairBeard")
    , @NamedQuery(name = "FacialFeature.findByFacialhairSideburns", query = "SELECT f FROM FacialFeature f WHERE f.facialhairSideburns = :facialhairSideburns")
    , @NamedQuery(name = "FacialFeature.findByGlasses", query = "SELECT f FROM FacialFeature f WHERE f.glasses = :glasses")
    , @NamedQuery(name = "FacialFeature.findByMakeupEyemakeup", query = "SELECT f FROM FacialFeature f WHERE f.makeupEyemakeup = :makeupEyemakeup")
    , @NamedQuery(name = "FacialFeature.findByMakeupLipmakeup", query = "SELECT f FROM FacialFeature f WHERE f.makeupLipmakeup = :makeupLipmakeup")
    , @NamedQuery(name = "FacialFeature.findByEmotionAnger", query = "SELECT f FROM FacialFeature f WHERE f.emotionAnger = :emotionAnger")
    , @NamedQuery(name = "FacialFeature.findByEmotionHapiness", query = "SELECT f FROM FacialFeature f WHERE f.emotionHapiness = :emotionHapiness")
    , @NamedQuery(name = "FacialFeature.findByEmotionSadness", query = "SELECT f FROM FacialFeature f WHERE f.emotionSadness = :emotionSadness")
    , @NamedQuery(name = "FacialFeature.findByEmotionContempt", query = "SELECT f FROM FacialFeature f WHERE f.emotionContempt = :emotionContempt")
    , @NamedQuery(name = "FacialFeature.findByEmotionDisgust", query = "SELECT f FROM FacialFeature f WHERE f.emotionDisgust = :emotionDisgust")
    , @NamedQuery(name = "FacialFeature.findByEmotionFear", query = "SELECT f FROM FacialFeature f WHERE f.emotionFear = :emotionFear")
    , @NamedQuery(name = "FacialFeature.findByEmotionNeutral", query = "SELECT f FROM FacialFeature f WHERE f.emotionNeutral = :emotionNeutral")
    , @NamedQuery(name = "FacialFeature.findByEmotionSurprise", query = "SELECT f FROM FacialFeature f WHERE f.emotionSurprise = :emotionSurprise")
    , @NamedQuery(name = "FacialFeature.findByNoiseNoiselevel", query = "SELECT f FROM FacialFeature f WHERE f.noiseNoiselevel = :noiseNoiselevel")
    , @NamedQuery(name = "FacialFeature.findByNoiseValue", query = "SELECT f FROM FacialFeature f WHERE f.noiseValue = :noiseValue")
    , @NamedQuery(name = "FacialFeature.findByOcclusionForehead", query = "SELECT f FROM FacialFeature f WHERE f.occlusionForehead = :occlusionForehead")
    , @NamedQuery(name = "FacialFeature.findByOcclusionEye", query = "SELECT f FROM FacialFeature f WHERE f.occlusionEye = :occlusionEye")
    , @NamedQuery(name = "FacialFeature.findByOcclusionMount", query = "SELECT f FROM FacialFeature f WHERE f.occlusionMount = :occlusionMount")})
public class FacialFeature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "faceId")
    private String faceId;
    @Size(max = 45)
    @Column(name = "facial_top")
    private String facialTop;
    @Size(max = 45)
    @Column(name = "face_left")
    private String faceLeft;
    @Size(max = 45)
    @Column(name = "face_width")
    private String faceWidth;
    @Size(max = 45)
    @Column(name = "face_height")
    private String faceHeight;
    @Size(max = 45)
    @Column(name = "hair_color")
    private String hairColor;
    @Size(max = 45)
    @Column(name = "smile")
    private String smile;
    @Size(max = 45)
    @Column(name = "headpose_pitch")
    private String headposePitch;
    @Size(max = 45)
    @Column(name = "headpose_roll")
    private String headposeRoll;
    @Size(max = 45)
    @Column(name = "head_pose_yaw")
    private String headPoseYaw;
    @Size(max = 45)
    @Column(name = "gender")
    private String gender;
    @Size(max = 45)
    @Column(name = "age")
    private String age;
    @Size(max = 45)
    @Column(name = "facialhair_mustache")
    private String facialhairMustache;
    @Size(max = 45)
    @Column(name = "facialhair_beard")
    private String facialhairBeard;
    @Size(max = 45)
    @Column(name = "facialhair_sideburns")
    private String facialhairSideburns;
    @Size(max = 45)
    @Column(name = "glasses")
    private String glasses;
    @Size(max = 45)
    @Column(name = "makeup_eyemakeup")
    private String makeupEyemakeup;
    @Size(max = 45)
    @Column(name = "makeup_lipmakeup")
    private String makeupLipmakeup;
    @Size(max = 45)
    @Column(name = "emotion_anger")
    private String emotionAnger;
    @Size(max = 45)
    @Column(name = "emotion_hapiness")
    private String emotionHapiness;
    @Size(max = 45)
    @Column(name = "emotion_sadness")
    private String emotionSadness;
    @Size(max = 45)
    @Column(name = "emotion_contempt")
    private String emotionContempt;
    @Size(max = 45)
    @Column(name = "emotion_disgust")
    private String emotionDisgust;
    @Size(max = 45)
    @Column(name = "emotion_fear")
    private String emotionFear;
    @Size(max = 45)
    @Column(name = "emotion_neutral")
    private String emotionNeutral;
    @Size(max = 45)
    @Column(name = "emotion_surprise")
    private String emotionSurprise;
    @Size(max = 45)
    @Column(name = "noise_noiselevel")
    private String noiseNoiselevel;
    @Size(max = 45)
    @Column(name = "noise_value")
    private String noiseValue;
    @Size(max = 45)
    @Column(name = "occlusion_forehead")
    private String occlusionForehead;
    @Size(max = 45)
    @Column(name = "occlusion_eye")
    private String occlusionEye;
    @Size(max = 45)
    @Column(name = "occlusion_mount")
    private String occlusionMount;
    @JoinColumn(name = "media_id", referencedColumnName = "id")
    @ManyToOne
    private Media mediaId;

    public FacialFeature() {
    }

    public FacialFeature(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getFacialTop() {
        return facialTop;
    }

    public void setFacialTop(String facialTop) {
        this.facialTop = facialTop;
    }

    public String getFaceLeft() {
        return faceLeft;
    }

    public void setFaceLeft(String faceLeft) {
        this.faceLeft = faceLeft;
    }

    public String getFaceWidth() {
        return faceWidth;
    }

    public void setFaceWidth(String faceWidth) {
        this.faceWidth = faceWidth;
    }

    public String getFaceHeight() {
        return faceHeight;
    }

    public void setFaceHeight(String faceHeight) {
        this.faceHeight = faceHeight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public String getHeadposePitch() {
        return headposePitch;
    }

    public void setHeadposePitch(String headposePitch) {
        this.headposePitch = headposePitch;
    }

    public String getHeadposeRoll() {
        return headposeRoll;
    }

    public void setHeadposeRoll(String headposeRoll) {
        this.headposeRoll = headposeRoll;
    }

    public String getHeadPoseYaw() {
        return headPoseYaw;
    }

    public void setHeadPoseYaw(String headPoseYaw) {
        this.headPoseYaw = headPoseYaw;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFacialhairMustache() {
        return facialhairMustache;
    }

    public void setFacialhairMustache(String facialhairMustache) {
        this.facialhairMustache = facialhairMustache;
    }

    public String getFacialhairBeard() {
        return facialhairBeard;
    }

    public void setFacialhairBeard(String facialhairBeard) {
        this.facialhairBeard = facialhairBeard;
    }

    public String getFacialhairSideburns() {
        return facialhairSideburns;
    }

    public void setFacialhairSideburns(String facialhairSideburns) {
        this.facialhairSideburns = facialhairSideburns;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public String getMakeupEyemakeup() {
        return makeupEyemakeup;
    }

    public void setMakeupEyemakeup(String makeupEyemakeup) {
        this.makeupEyemakeup = makeupEyemakeup;
    }

    public String getMakeupLipmakeup() {
        return makeupLipmakeup;
    }

    public void setMakeupLipmakeup(String makeupLipmakeup) {
        this.makeupLipmakeup = makeupLipmakeup;
    }

    public String getEmotionAnger() {
        return emotionAnger;
    }

    public void setEmotionAnger(String emotionAnger) {
        this.emotionAnger = emotionAnger;
    }

    public String getEmotionHapiness() {
        return emotionHapiness;
    }

    public void setEmotionHapiness(String emotionHapiness) {
        this.emotionHapiness = emotionHapiness;
    }

    public String getEmotionSadness() {
        return emotionSadness;
    }

    public void setEmotionSadness(String emotionSadness) {
        this.emotionSadness = emotionSadness;
    }

    public String getEmotionContempt() {
        return emotionContempt;
    }

    public void setEmotionContempt(String emotionContempt) {
        this.emotionContempt = emotionContempt;
    }

    public String getEmotionDisgust() {
        return emotionDisgust;
    }

    public void setEmotionDisgust(String emotionDisgust) {
        this.emotionDisgust = emotionDisgust;
    }

    public String getEmotionFear() {
        return emotionFear;
    }

    public void setEmotionFear(String emotionFear) {
        this.emotionFear = emotionFear;
    }

    public String getEmotionNeutral() {
        return emotionNeutral;
    }

    public void setEmotionNeutral(String emotionNeutral) {
        this.emotionNeutral = emotionNeutral;
    }

    public String getEmotionSurprise() {
        return emotionSurprise;
    }

    public void setEmotionSurprise(String emotionSurprise) {
        this.emotionSurprise = emotionSurprise;
    }

    public String getNoiseNoiselevel() {
        return noiseNoiselevel;
    }

    public void setNoiseNoiselevel(String noiseNoiselevel) {
        this.noiseNoiselevel = noiseNoiselevel;
    }

    public String getNoiseValue() {
        return noiseValue;
    }

    public void setNoiseValue(String noiseValue) {
        this.noiseValue = noiseValue;
    }

    public String getOcclusionForehead() {
        return occlusionForehead;
    }

    public void setOcclusionForehead(String occlusionForehead) {
        this.occlusionForehead = occlusionForehead;
    }

    public String getOcclusionEye() {
        return occlusionEye;
    }

    public void setOcclusionEye(String occlusionEye) {
        this.occlusionEye = occlusionEye;
    }

    public String getOcclusionMount() {
        return occlusionMount;
    }

    public void setOcclusionMount(String occlusionMount) {
        this.occlusionMount = occlusionMount;
    }

    public Media getMediaId() {
        return mediaId;
    }

    public void setMediaId(Media mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacialFeature)) {
            return false;
        }
        FacialFeature other = (FacialFeature) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.security.nexarssecurity.entities.FacialFeature[ id=" + id + " ]";
    }
    
}
