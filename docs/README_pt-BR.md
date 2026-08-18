<div align="center">

<img src="\imgs\icon.webp" width="160" height="160" style="display: block; margin: 0 auto;" alt="icon" />

# HyperCeiler

### Make HyperOS Great Again!

[简体中文](/docs/README_zh-CN.md)&nbsp;&nbsp;|&nbsp;&nbsp;[繁體中文](/docs/README_zh-HK.md)&nbsp;&nbsp;|&nbsp;&nbsp;[English](/docs/README_en-US.md)&nbsp;&nbsp;|&nbsp;&nbsp;[Українська](/docs/README_uk_UA.md)&nbsp;&nbsp;|&nbsp;&nbsp;Português (Brasil)

</div>

## Versão Suportada Atualmente

HyperOS 4.0 para Android 17

## Instruções de uso

Ative o HyperCeiler no [LSPosed](https://github.com/LSPosed/LSPosed/releases), depois ative as funções correspondentes dentro do aplicativo HyperCeiler e reinicie o escopo (requer permissão Root).

Este módulo **não suporta** `ROMs Xiaomi HyperOS de terceiros com muitas modificações`, `softwares de sistema com muitas modificações` e `algumas ROMs Xiaomi HyperOS internacionais`.

Atualmente, o HyperCeiler está sendo adaptado com base no Xiaomi HyperOS 4.0 para dispositivos móveis com Android 17. A cobertura não é completa e são necessários testes e melhorias contínuas.

Antes de enviar feedback, verifique se já existe um feedback idêntico para evitar causar transtornos aos desenvolvedores. Gastar a mesma energia lendo o mesmo feedback é uma perda de tempo.

O HyperCeiler parou de manter todas as ROMs MIUI e HyperOS 1.0/2.0/3.0 para Android 11-16.

> Para ROMs MIUI no Android 11-12, use [esta versão](https://github.com/ReChronoRain/Cemiuiler/releases/tag/1.3.130).
>
> Para ROMs MIUI no Android 13 e ROM HyperOS 1.0, use [esta versão](https://github.com/Xposed-Modules-Repo/com.sevtinge.hyperceiler/releases/download/3866-2.5.156_20250118/HyperCeiler_2.5.156_20250118_3866_release_miui.apk).
>
> As versões HyperOS 1.0/2.0/3.0 para Android 14-16 foram arquivadas. A partir da versão 3.0.0, o suporte para Android 16 e versões anteriores será removido.

## Planejamento do Projeto

O Xiaomi HyperOS 3 ou 4 será o ponto final deste projeto. No momento, a Xiaomi ajustou seletivamente suas próprias funções (anti-humanas) com base nas funções do Xposed, e as funções do módulo estão diminuindo gradualmente com as atualizações do sistema.

É também uma jornada de observar o HyperOS evoluir de algo inutilizável sem Root para algo quase utilizável (exceto para tablets Xiaomi).

No futuro, este módulo será profundamente adaptado para HyperOS 3.0 e superior (mas sem garantia de que todos os recursos funcionarão). O HyperOS 2 será arquivado em manutenções subsequentes (devido a grandes diferenças).

## Aplicativos incluídos no escopo

<details>
    <summary>Clique para expandir</summary>

| Nome do App | Nome do Pacote |
|:-------------------|:-----------------------------------|
| Framework do Sistema | system |
| Interface do Sistema | com.android.systemui |
| Launcher do Sistema | com.miui.home |
| Atualizador do Sistema | com.android.updater |
| Joyose | com.xiaomi.joyose |
| Configurações Mi | com.xiaomi.misettings |
| Segurança (Segurança, Gerenciador de Tablet) | com.miui.securitycenter |
| Plano de Fundo | com.miui.miwallpaper |
| Extensão de Conteúdo | com.miui.contentextension |
| Notificação de Barragem | com.xiaomi.barrage |
| Telefone | com.android.incallui |
| Serviço de Telefone | com.android.phone |
| Energia e Performance | com.miui.powerkeeper |
| Mensagens | com.android.mms |
| Captura de Tela | com.miui.screenshot |
| Calendário | com.android.calendar |
| Notas | com.miui.notes |
| Navegador | com.android.browser |
| Rueban (MTB) | com.xiaomi.mtb |
| Gravador de Tela | com.miui.screenrecorder |
| Gerenciador de Permissões | com.lbe.security.miui |
| Configurações | com.android.settings |
| Teclado Sogou Edição Mi | com.sohu.inputmethod.sogou.xiaomi |
| Clima | com.miui.weather2 |
| Interconectividade (Transmitir) | com.milink.service |
| Armazenamento Externo | com.android.externalstorage |
| AOD e Bloqueio de Tela | com.miui.aod |
| Gerenciador de Arquivos | com.android.fileexplorer |
| Plugin de Serviço do Sistema | com.miui.securityadd |
| Interface do Gerenciador de Downloads | com.android.providers.downloads.ui |
| Gerenciador de Downloads | com.android.providers.downloads |
| Galeria | com.miui.gallery |
| Mi Canvas | com.miui.creation |
| Mi Share | com.miui.mishare.connectivity |
| Editor da Galeria | com.miui.mediaeditor |
| Mi Cloud | com.miui.cloudservice |
| Cartão Inteligente Mi | com.miui.tsmclient |
| Carteira Mi | com.mipay.wallet |
| Teclado iFlytek Edição Mi | com.iflytek.inputmethod.miui |
| Instalador de Pacotes | com.miui.packageinstaller |
| GetApps | com.xiaomi.market |
| Assistente Pessoal | com.miui.personalassistant |
| Loja de Temas (Temas, Planos de Fundo e Personalização) | com.android.thememanager |
| Plugin de Segurança do Sistema | com.miui.guardprovider |
| Câmera | com.android.camera |
| Mi AI Tradução | com.xiaomi.aiasst.vision |
| Mecanismo Mi Hyper AI | com.xiaomi.aicr |
| Mi AI Scanner | com.xiaomi.scanner |
| Serviço NFC | com.android.nfc |
| Mi Som | com.miui.misound |
| Backup | com.miui.backup |
| Mi Mover | com.miui.huanji |
| MiTrustService | com.xiaomi.trustservice |
| Visualizador HTML | com.android.htmlviewer |
| Telecom | com.android.server.telecom |
| Controle Remoto Mi | com.duokan.phone.remotecontroller |
| Analytics | com.miui.analytics |
| Comunidade Mi | com.xiaomi.vipaccount |
| Ativação por Voz | com.miui.voicetrigger |
| Gravador de Som | com.android.soundrecorder |
| LPA | com.miui.euicc |
| Serviço de Ativação Mi SIM | com.xiaomi.simactivate.service |
| Colaboração de Telas | com.xiaomi.mirror |

</details>

> O mesmo escopo recomendado no LSPosed

## Grupos de Comunicação e Feedback

Junte-se aos nossos grupos para dar feedback ou ficar atualizado.

[![badge_trguild]][trguild_url]
[![badge_tcguild]][tcguild_url]
[![badge_telegram]][telegram_url]

## Contribua com Traduções para o HyperCeiler

Usamos o Hosted Weblate para sincronização de traduções do projeto. Você pode contribuir com traduções para o projeto HyperCeiler [aqui](https://hosted.weblate.org/engage/hyperceiler/).

<a href="https://hosted.weblate.org/engage/hyperceiler/">
<img src="https://hosted.weblate.org/widget/hyperceiler/multi-auto.svg" alt="Status da tradução" />
</a>

> Nota: Quando o progresso da tradução de um novo idioma atingir 85% ou mais, ele entrará no processo de mesclagem. Se um idioma adicionado cair abaixo de 30% do texto original, ele será removido temporariamente até atingir 85% novamente.

## Agradecimentos

> O HyperCeiler usa parte ou todo o conteúdo dos seguintes projetos de código aberto. Agradecemos aos desenvolvedores desses projetos pelo grande apoio (em ordem aleatória).

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

[badge_trguild]: https://img.shields.io/badge/TG-Canal-4991D3?style=for-the-badge&logo=telegram

[tcguild_url]: https://t.me/cemiuiler_canary

[badge_tcguild]: https://img.shields.io/badge/TGCI-Canal-4991D3?style=for-the-badge&logo=telegram

[telegram_url]: https://t.me/cemiuiler

[badge_telegram]: https://img.shields.io/badge/dynamic/json?style=for-the-badge&color=2CA5E0&label=Telegram&logo=telegram&query=%24.data.totalSubs&url=https%3A%2F%2Fapi.spencerwoo.com%2Fsubstats%2F%3Fsource%3Dtelegram%26queryKey%3Dcemiuiler
