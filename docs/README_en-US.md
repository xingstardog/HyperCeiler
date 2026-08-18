<div align="center">

<img src="\imgs\icon.webp" width="160" height="160" style="display: block; margin: 0 auto;" alt="icon" />

# HyperCeiler

### Make HyperOS Great Again!

[简体中文](/docs/README_zh-CN.md)&nbsp;&nbsp;|&nbsp;&nbsp;[繁體中文](/docs/README_zh-HK.md)&nbsp;&nbsp;|&nbsp;&nbsp;English&nbsp;&nbsp;|&nbsp;&nbsp;[Українська](/docs/README_uk_UA.md)&nbsp;&nbsp;|&nbsp;&nbsp;[Português (Brasil)](/docs/README_pt-BR.md)

</div>

## Currently Supported Version

HyperOS 4.0 for Android 17

## Instructions

Please enable HyperCeiler in [LSPosed](https://github.com/LSPosed/LSPosed/releases), then enable the corresponding features in the HyperCeiler app, and restart the scope (Root permission required).

This module **does not support** `third-party Xiaomi HyperOS ROMs with many modifications`, `system software with many modifications`, and `some international Xiaomi HyperOS ROMs`.

Currently, HyperCeiler is adapted based on Xiaomi HyperOS 4.0 for mobile devices on Android 17. The coverage is not very complete, and continuous testing and improvement are needed.

Please check if there is similar feedback before submitting yours to avoid causing trouble to developers. Spending the same energy looking at the same feedback is a waste of time.

HyperCeiler has stopped maintenance for all MIUI and HyperOS 1.0/2.0/3.0 ROMs on Android 11-16.

> For MIUI ROMs on Android 11-12, please use [this version](https://github.com/ReChronoRain/Cemiuiler/releases/tag/1.3.130).
>
> For MIUI ROMs on Android 13 and HyperOS 1.0 ROM, please use [this version](https://github.com/Xposed-Modules-Repo/com.sevtinge.hyperceiler/releases/download/3866-2.5.156_20250118/HyperCeiler_2.5.156_20250118_3866_release_miui.apk).
>
> Android 14-16 HyperOS 1.0/2.0/3.0 has been archived. Starting from version 3.0.0, support for Android 16 and below will be removed.

## Project Planning

Xiaomi HyperOS 3 or 4 will be the endpoint of this project. For now, Xiaomi has selectively adjusted its own (anti-human) features based on Xposed functions, and the module's features are gradually decreasing with system updates.

It's also a journey of watching HyperOS evolve from something unusable without Root to something almost usable (except for Xiaomi tablets).

In the future, this module will be deeply adapted for HyperOS 3.0 and above (but no guarantee that all features will work). HyperOS 2 will be archived in subsequent maintenance (due to significant differences).

## Apps included in the scope

<details>
    <summary>Click to expand</summary>

| App Name | Package Name |
|:-------------------|:-----------------------------------|
| System Framework | system |
| System UI | com.android.systemui |
| System Launcher | com.miui.home |
| System Updater | com.android.updater |
| Joyose | com.xiaomi.joyose |
| Mi Settings | com.xiaomi.misettings |
| Security (Security Center, Tablet Manager) | com.miui.securitycenter |
| Wallpaper | com.miui.miwallpaper |
| Content Extension | com.miui.contentextension |
| Bullet Notification | com.xiaomi.barrage |
| Phone | com.android.incallui |
| Phone Service | com.android.phone |
| Power and Performance | com.miui.powerkeeper |
| Messaging | com.android.mms |
| Screenshot | com.miui.screenshot |
| Calendar | com.android.calendar |
| Notes | com.miui.notes |
| Browser | com.android.browser |
| Rueban (MTB) | com.xiaomi.mtb |
| Screen Recorder | com.miui.screenrecorder |
| Permission Manager | com.lbe.security.miui |
| Settings | com.android.settings |
| Sogou Input Mi Edition | com.sohu.inputmethod.sogou.xiaomi |
| Weather | com.miui.weather2 |
| Interconnectivity (Cast) | com.milink.service |
| External Storage | com.android.externalstorage |
| AOD & Lockscreen (Always-on Display) | com.miui.aod |
| File Explorer | com.android.fileexplorer |
| System Service Plugin | com.miui.securityadd |
| Download Manager UI | com.android.providers.downloads.ui |
| Download Manager | com.android.providers.downloads |
| Gallery | com.miui.gallery |
| Mi Canvas | com.miui.creation |
| Mi Share | com.miui.mishare.connectivity |
| Gallery Editor | com.miui.mediaeditor |
| Mi Cloud | com.miui.cloudservice |
| Mi Smart Card | com.miui.tsmclient |
| Mi Wallet | com.mipay.wallet |
| iFlytek Input Mi Edition | com.iflytek.inputmethod.miui |
| Package Installer | com.miui.packageinstaller |
| GetApps | com.xiaomi.market |
| Personal Assistant | com.miui.personalassistant |
| Theme Store (Themes, Wallpapers & Personalization) | com.android.thememanager |
| System Security Plugin | com.miui.guardprovider |
| Camera | com.android.camera |
| Mi AI Translate | com.xiaomi.aiasst.vision |
| Mi Hyper AI Engine | com.xiaomi.aicr |
| Mi AI Scanner | com.xiaomi.scanner |
| NFC Service | com.android.nfc |
| Mi Sound | com.miui.misound |
| Backup | com.miui.backup |
| Mi Mover | com.miui.huanji |
| MiTrustService | com.xiaomi.trustservice |
| HTML Viewer | com.android.htmlviewer |
| Telecom | com.android.server.telecom |
| Mi Remote | com.duokan.phone.remotecontroller |
| Analytics | com.miui.analytics |
| Mi Community | com.xiaomi.vipaccount |
| Voice Trigger | com.miui.voicetrigger |
| Sound Recorder | com.android.soundrecorder |
| LPA | com.miui.euicc |
| Mi SIM Activation Service | com.xiaomi.simactivate.service |
| Screen Collaboration | com.xiaomi.mirror |

</details>

> Same as the recommended scope in LSPosed

## Communication & Feedback Groups

Join our groups to provide feedback or stay updated.

[![badge_trguild]][trguild_url]
[![badge_tcguild]][tcguild_url]
[![badge_telegram]][telegram_url]

## Contribute Translations to HyperCeiler

We use Hosted Weblate for translation synchronization. You can contribute translations for the HyperCeiler project [here](https://hosted.weblate.org/engage/hyperceiler/).

<a href="https://hosted.weblate.org/engage/hyperceiler/">
<img src="https://hosted.weblate.org/widget/hyperceiler/multi-auto.svg" alt="Translation status" />
</a>

> Note: When a new language translation reaches 85% or more, it will enter the merge process. If an added language falls below 30% of the source text, it will be temporarily removed until it reaches 85% again.

## Thanks

> HyperCeiler uses some or all of the content from the following open-source projects. Thanks to the developers of these projects for their great support (in no particular order).

- [「Accompanist」 by Android Open Source Project, Google Inc.](https://google.github.io/accompanist)
- [「Android」 by Android Open Source Project, Google Inc.](https://source.android.google.cn/license)
- [「AndroidHiddenApiBypass」 by LSPosed](https://github.com/LSPosed/AndroidHiddenApiBypass)
- [「AndroidX」 by Android Open Source Project, Google Inc.](https://github.com/androidx/androidx)
- [「AutoSEffSwitch」 by HChenX](https://github.com/HChenX/AutoSEffSwitch)
- [「AntiAntiDefraud」 by MinaMichita](https://github.com/MinaMichita/AntiAntiDefraud)
- [「AutoNFC」 by GSWXXN](https://github.com/GSWXXN/AutoNFC)
- [「BypassSignCheck」 by Weverses](https://github.com/Weverses/BypassSignCheck)
- [「CorePatch」 by LSPosed](https://github.com/LSPosed/CorePatch)
- [「CustoMIUIzer」 by MonwF](https://github.com/MonwF/customiuizer)
- [「CustoMIUIzerMod」 by liyafe1997](https://github.com/liyafe1997/CustoMIUIzerMod)
- [「ClipboardList」 by HChenX](https://github.com/HChenX/ClipboardList)
- [「DexKit」 by LuckyPray](https://github.com/LuckyPray/DexKit)
- [「Disable app link verify」 by tehcneko](https://github.com/Xposed-Modules-Repo/io.github.tehcneko.applinkverify)
- [「DisableFlagSecure」 by LSPosed](https://github.com/LSPosed/DisableFlagSecure)
- [「DisableLogRequest」 by QueallyTech](https://github.com/QueallyTech/DisableLogRequest)
- [「EzXHelper」 by KyuubiRan](https://github.com/KyuubiRan/EzXHelper)
- [「EzHookTool」 by lingqiqi5211](https://github.com/lingqiqi5211/EzHookTool)
- [「FixMiuiMediaControlPanel」 by qqlittleice](https://github.com/qqlittleice/FixMiuiMediaControlPanel)
- [「FocusNotifLyric」 by wuyou-123](https://github.com/wuyou-123/FocusNotifLyric)
- [「ForegroundPin」 by HChenX](https://github.com/HChenX/ForegroundPin)
- [「FuckNFC」 by xiaowine](https://github.com/xiaowine/FuckNFC)
- [「Gson」 by Android Open Source Project, Google Inc.](https://github.com/google/gson)
- [「XiaomiHelper」 by HowieHChen](https://github.com/HowieHChen/XiaomiHelper)
- [「HideMiuiClipboardDialog」 by zerorooot](https://github.com/zerorooot/HideMiuiClipboardDialog)
- [「HyperFocusApi」 by ghhccghk](https://github.com/ghhccghk/HyperFocusApi)
- [「HyperSmartCharge」 by buffcow](https://github.com/buffcow/HyperSmartCharge)
- [「HyperStar」 by YunZiA](https://github.com/YunZiA/HyperStar)
- [「Kotlin」 by JetBrains](https://github.com/JetBrains/kotlin)
- [「MaxFreeForm」 by YifePlayte](https://github.com/YifePlayte/MaxFreeForm)
- [「MediaControlOpt」 by YuKongA](https://github.com/YuKongA/MediaControlOpt)
- [「MiuiFeature」 by MoralNorm](https://github.com/moralnorm/miui_feature)
- [「MiuiHomeR」 by qqlittleice](https://github.com/qqlittleice/MiuiHome_R)
- [「MIUI IME Unlock」 by RC1844](https://github.com/RC1844/MIUI_IME_Unlock)
- [「MIUIQOL」 by chsbuffer](https://github.com/chsbuffer/MIUIQOL)
- [「MiuiXXL」 by Wine-Network](https://github.com/Wine-Network/Miui_XXL)
- [「HyperOSXXL」 by YuKongA](https://github.com/YuKongA/HyperOS_XXL)
- [「MIUI Notification Fix」 by tehcneko](https://github.com/Xposed-Modules-Repo/io.github.tehcneko.miuinotificationfix)
- [「ModemPro」 by Weverse](https://github.com/Weverses/ModemPro)
- [「NoStorageRestrict」 by DanGLES3](https://github.com/Xposed-Modules-Repo/com.github.dan.nostoragerestrict)
- [「PortalHook」 by Haocen2004](https://github.com/Haocen2004/PortalHook)
- [「PinningApp」 by HChenX](https://github.com/HChenX/PinningApp)
- [「RemoveMiuiSystemSelfProtection」 by gfbjngjibn](https://github.com/gfbjngjibn/RemoveMiuiSystemSelfProtection)
- [「SettingsDontThroughTheList」 by weixiansen574](https://github.com/weixiansen574/settingsdontthroughthelist)
- [「StarVoyager」 by hosizoraru](https://github.com/hosizoraru/StarVoyager)
- [「SuperLyric」 by HChenX](https://github.com/HChenX/SuperLyric)
- [「WINI」 by ouhoukyo](https://github.com/ouhoukyo/WINI)
- [「WOMMO」 by YifePlayte](https://github.com/YifePlayte/WOMMO)
- [「Woobox For MIUI」 by hosizoraru](https://github.com/hosizoraru/WooBoxForMIUI)
- [「Woobox For MIUI」 by Simplicity-Team](https://github.com/Simplicity-Team/WooBoxForMIUI)
- [「Xposed」 by rovo89, Tungstwenty](https://github.com/rovo89/XposedBridge)
- [「XposedBridge」 by rovo89](https://github.com/rovo89/XposedBridge)
- [「.xlDownload」 by Kr328](https://github.com/Kr328/.xlDownload)

[trguild_url]: https://t.me/cemiuiler_release

[badge_trguild]: https://img.shields.io/badge/TG-Channel-4991D3?style=for-the-badge&logo=telegram

[tcguild_url]: https://t.me/cemiuiler_canary

[badge_tcguild]: https://img.shields.io/badge/TGCI-Channel-4991D3?style=for-the-badge&logo=telegram

[telegram_url]: https://t.me/cemiuiler

[badge_telegram]: https://img.shields.io/badge/dynamic/json?style=for-the-badge&color=2CA5E0&label=Telegram&logo=telegram&query=%24.data.totalSubs&url=https%3A%2F%2Fapi.spencerwoo.com%2Fsubstats%2F%3Fsource%3Dtelegram%26queryKey%3Dcemiuiler
