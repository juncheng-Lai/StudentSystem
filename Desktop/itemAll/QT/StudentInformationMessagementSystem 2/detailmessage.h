#ifndef DETAILMESSAGE_H
#define DETAILMESSAGE_H

#include <QDialog>

namespace Ui {
class DetailMessage;
}

class DetailMessage : public QDialog
{
    Q_OBJECT

public:
    explicit DetailMessage(QWidget *parent = 0);
    ~DetailMessage();

private:
    Ui::DetailMessage *ui;
};

#endif // DETAILMESSAGE_H
