<div align="center">

<img src="\imgs\icon.webp" width="160" height="160" style="display: block; margin: 0 auto;" alt="icon" />

# HyperCeiler

### Make HyperOS Great Again!

[简体中文](/docs/README_zh-CN.md)&nbsp;&nbsp;|&nbsp;&nbsp;[繁體中文](/docs/README_zh-HK.md)&nbsp;&nbsp;|&nbsp;&nbsp;[English](/docs/README_en-US.md)&nbsp;&nbsp;|&nbsp;&nbsp;Українська&nbsp;&nbsp;|&nbsp;&nbsp;[Português (Brasil)](/docs/README_pt-BR.md)

</div>

## Поточна підтримувана версія

HyperOS 4.0 для Android 17

## Інструкція перед використанням

Будь ласка, увімкніть HyperCeiler у [LSPosed](https://github.com/LSPosed/LSPosed/releases), потім активуйте відповідні функції в додатку HyperCeiler та перезапустіть область дії (потрібні права Root).

Цей модуль **не підтримує** `сторонні прошивки Xiaomi HyperOS з великою кількістю модифікацій`, `системне ПЗ з великою кількістю модифікацій`, а також `деякі міжнародні прошивки Xiaomi HyperOS`.

Наразі HyperCeiler адаптується на основі Xiaomi HyperOS 4.0 для мобільних пристроїв на базі Android 17. Покриття не є повним, потрібне постійне тестування та вдосконалення.

Перед подачею відгуку, будь ласка, перевірте, чи немає вже схожого відгуку, щоб не турбувати розробників. Витрачати стільки ж енергії на читання однакових відгуків — це марна трата часу.

HyperCeiler припинив підтримку всіх прошивок MIUI та HyperOS 1.0/2.0/3.0 на Android 11-16.

> Для прошивок MIUI на Android 11-12, будь ласка, використовуйте [цю версію](https://github.com/ReChronoRain/Cemiuiler/releases/tag/1.3.130).
>
> Для прошивок MIUI на Android 13 та HyperOS 1.0, будь ласка, використовуйте [цю версію](https://github.com/Xposed-Modules-Repo/com.sevtinge.hyperceiler/releases/download/3866-2.5.156_20250118/HyperCeiler_2.5.156_20250118_3866_release_miui.apk).
>
> Android 14-16 HyperOS 1.0/2.0/3.0 було архівовано. Починаючи з версії 3.0.0, підтримку Android 16 та нижче буде видалено.

## Планування проекту

Xiaomi HyperOS 3 або 4 стане кінцевою точкою цього проекту. На даний момент офіційна Xiaomi вибірково скоригувала свої власні (антигуманні) функції на основі функцій Xposed, і можливості модуля поступово зменшуються з оновленням системи.

Це також шлях спостереження за тим, як HyperOS еволюціонує від чогось непридатного без Root до чогось майже придатного (за винятком планшетів Xiaomi).

У майбутньому цей модуль буде глибоко адаптований для HyperOS 3.0 і вище (але без гарантії, що всі функції працюватимуть). HyperOS 2 буде архівовано в ході подальшого обслуговування (через значні відмінності).

## Додатки, включені в область дії

<details>
    <summary>Натисніть, щоб розгорнути</summary>

| Назва додатка | Пакет |
|:-------------------|:-----------------------------------|
| System Framework | system |
| System UI | com.android.systemui |
| System Launcher | com.miui.home |
| System Updater | com.android.updater |
| Joyose | com.xiaomi.joyose |
| Mi Settings | com.xiaomi.misettings |
| Безпека (Центр безпеки, Менеджер планшета) | com.miui.securitycenter |
| Шпалери | com.miui.miwallpaper |
| Content Extension | com.miui.contentextension |
| Екранні повідомлення | com.xiaomi.barrage |
| Телефон | com.android.incallui |
| Служба телефону | com.android.phone |
| Живлення та продуктивність | com.miui.powerkeeper |
| Повідомлення | com.android.mms |
| Знімок екрана | com.miui.screenshot |
| Календар | com.android.calendar |
| Нотатки | com.miui.notes |
| Браузер | com.android.browser |
| Rueban (MTB) | com.xiaomi.mtb |
| Запис екрана | com.miui.screenrecorder |
| Менеджер дозволів | com.lbe.security.miui |
| Налаштування | com.android.settings |
| Sogou Input Mi Edition | com.sohu.inputmethod.sogou.xiaomi |
| Погода | com.miui.weather2 |
| Interconnectivity (Трансляція) | com.milink.service |
| Зовнішнє сховище | com.android.externalstorage |
| AOD та екран блокування | com.miui.aod |
| Файловий менеджер | com.android.fileexplorer |
| Плагін системних служб | com.miui.securityadd |
| Менеджер завантажень UI | com.android.providers.downloads.ui |
| Менеджер завантажень | com.android.providers.downloads |
| Галерея | com.miui.gallery |
| Mi Canvas | com.miui.creation |
| Mi Share | com.miui.mishare.connectivity |
| Редактор галереї | com.miui.mediaeditor |
| Mi Cloud | com.miui.cloudservice |
| Mi Smart Card | com.miui.tsmclient |
| Mi Wallet | com.mipay.wallet |
| iFlytek Input Mi Edition | com.iflytek.inputmethod.miui |
| Інсталятор пакетів | com.miui.packageinstaller |
| GetApps | com.xiaomi.market |
| Персональний помічник | com.miui.personalassistant |
| Магазин тем (Теми, шпалери та персоналізація) | com.android.thememanager |
| Плагін системної безпеки | com.miui.guardprovider |
| Камера | com.android.camera |
| Mi AI Translate | com.xiaomi.aiasst.vision |
| Mi Hyper AI Engine | com.xiaomi.aicr |
| Mi AI Scanner | com.xiaomi.scanner |
| Служба NFC | com.android.nfc |
| Mi Sound | com.miui.misound |
| Резервне копіювання | com.miui.backup |
| Mi Mover | com.miui.huanji |
| MiTrustService | com.xiaomi.trustservice |
| Переглядач HTML | com.android.htmlviewer |
| Телеком | com.android.server.telecom |
| Mi Remote | com.duokan.phone.remotecontroller |
| Аналітика | com.miui.analytics |
| Спільнота Mi | com.xiaomi.vipaccount |
| Голосовий запуск | com.miui.voicetrigger |
| Диктофон | com.android.soundrecorder |
| LPA | com.miui.euicc |
| Служба активації Mi SIM | com.xiaomi.simactivate.service |
| Спільна робота екранів | com.xiaomi.mirror |

</details>

> Така ж, як рекомендована область дії в LSPosed

## Групи спілкування та зворотного зв'язку

Приєднуйтесь до наших груп, щоб надіслати відгук або дізнатися про останні новини.

[![badge_trguild]][trguild_url]
[![badge_tcguild]][tcguild_url]
[![badge_telegram]][telegram_url]

## Допоможіть з перекладом HyperCeiler

Ми використовуємо Hosted Weblate для синхронізації перекладів проекту. Ви можете допомогти з перекладом проекту HyperCeiler [тут](https://hosted.weblate.org/engage/hyperceiler/).

<a href="https://hosted.weblate.org/engage/hyperceiler/">
<img src="https://hosted.weblate.org/widget/hyperceiler/multi-auto.svg" alt="Статус перекладу" />
</a>

> Примітка: Коли прогрес перекладу на нову мову досягне 85% або більше, він увійде в процес злиття. Якщо прогрес перекладу доданої мови впаде нижче 30% від вихідного тексту, вона буде тимчасово видалена, доки знову не досягне 85%.

## Подяки

> HyperCeiler використовує частину або весь вміст наступних проектів з відкритим кодом. Дякуємо розробникам цих проектів за їхню велику підтримку (в довільному порядку).

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
